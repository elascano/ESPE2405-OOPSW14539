package ec.edu.espe.mongotable.controller;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;
/**
 *
 *  @author Yostin Sisalema,Code Master, DCCO-ESPE
 */
public class TablesCrud {
    private final MongoDatabase mongodb;
    private final String collectionTables = "tables";
    private final MongoCollection<Document> mongoCollection;
    
    public TablesCrud() {
        this.mongodb = Connection.mongodb;
        this.mongoCollection = mongodb.getCollection(collectionTables);
    }
    public void createTable(Table table) {
        mongoCollection.insertOne(table.buildDocumentTable());
    }

    public void readTable() {
        FindIterable<Document> tables = mongoCollection.find();
        for (Document table : tables) {
            System.out.println(table);
        }
    }

    public void updateTable() {
        mongoCollection.updateOne(Filters.eq("name", "pino"), Updates.set("name", "acacia"));
    }

    public void deleteTable() {
        mongoCollection.deleteOne(Filters.eq("name", "cerezo"));
    }
}
