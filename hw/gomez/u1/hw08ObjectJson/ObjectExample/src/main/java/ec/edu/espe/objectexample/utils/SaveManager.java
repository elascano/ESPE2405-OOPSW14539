/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.objectexample.utils;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Autor: Joffre
 * Fecha: 2024-06-11
 * Descripción:
 */
public class SaveManager {
    public static void saveToJsonFile(Object object, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            String json = convertToJson(object);
            fileWriter.write(json);
            System.out.println("Archivo JSON guardado correctamente como: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String convertToJson(Object object) {
        if (object == null) {
            return "{}"; // Manejo del caso cuando el objeto es nulo
        }

        // Crear un mapa para almacenar los campos y sus valores
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = object.getClass();

        // Obtener los campos y sus valores
        map.putAll(getFieldsAndValues(object, clazz));

        // Construir la cadena JSON
        StringBuilder jsonBuilder = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            jsonBuilder.append("\"").append(entry.getKey()).append("\":")
                    .append(convertToJsonValue(entry.getValue())).append(",");
        }
        if (jsonBuilder.charAt(jsonBuilder.length() - 1) == ',') {
            jsonBuilder.deleteCharAt(jsonBuilder.length() - 1); // Eliminar la última coma
        }
        jsonBuilder.append("}");

        return jsonBuilder.toString();
    }

    private static Map<String, Object> getFieldsAndValues(Object object, Class<?> clazz) {
        Map<String, Object> fieldMap = new HashMap<>();
        for (Field field : clazz.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                fieldMap.put(field.getName(), field.get(object));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return fieldMap;
    }

    private static String convertToJsonValue(Object value) {
        if (value == null) {
            return "null";
        } else if (value instanceof String) {
            return "\"" + value + "\"";
        } else {
            return value.toString();
        }
    }
}
 

