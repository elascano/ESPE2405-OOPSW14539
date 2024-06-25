
package utils;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
/**
 *
 * @author Kerlly Chiriboga, ODS
 * @param <T>
 */


public class JsonCrud<T> {
    private final Gson gson = new Gson();
    private final Type typeOfT;
    private final String fileName;

    public JsonCrud(String fileName, Type typeOfT) {
        this.fileName = fileName;
        this.typeOfT = typeOfT;
    }

    private List<T> readFromJson() throws IOException {
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, typeOfT);
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private void writeToJson(List<T> entities) throws IOException {
        String data = gson.toJson(entities);
        FileManager.save(data, fileName, "json");
    }

    public T create(T entity) throws IOException {
        List<T> entities = readFromJson();
        entities.add(entity);
        writeToJson(entities);
        return entity;
    }

    public List<T> readAll() throws IOException {
        return readFromJson();
    }

    public Optional<T> readById(Predicate<T> predicate) throws IOException {
        List<T> entities = readFromJson();
        return entities.stream().filter(predicate).findFirst();
    }

    public T update(T entity, Predicate<T> predicate) throws IOException {
        List<T> entities = readFromJson();
        for (int i = 0; i < entities.size(); i++) {
            if (predicate.test(entities.get(i))) {
                entities.set(i, entity);
                writeToJson(entities);
                return entity;
            }
        }
        return null;
    }

    public boolean delete(Predicate<T> predicate) throws IOException {
        List<T> entities = readFromJson();
        boolean removed = entities.removeIf(predicate);
        if (removed) {
            writeToJson(entities);
        }
        return removed;
    }

    public Optional<T> find(Predicate<T> predicate) throws IOException {
        List<T> entities = readFromJson();
        return entities.stream().filter(predicate).findFirst();
    }
}
