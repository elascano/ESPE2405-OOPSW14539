package espe.edu.es.mongoDB.util;


import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;


public class Conexion {
    private MongoClient mongo;
    private MongoDatabase dataB;

    public MongoClient getMongo() {
        return mongo;
    }

    public void setMongo(MongoClient mongo) {
        this.mongo = mongo;
    }

    public MongoDatabase getDataB() {
        return dataB;
    }

    public void setDataB(MongoDatabase dataB) {
        this.dataB = dataB;
    }

    public Conexion() {
    }

    public Conexion(MongoClient mongo, MongoDatabase dataB) {
        this.mongo = mongo;
        this.dataB = dataB;
    }
    
    public Conexion crearConexion(){
        String servidor="localhost";
        int puerto=27017;
        try{
           mongo=new MongoClient(servidor,puerto);
           dataB=mongo.getDatabase("Cardb");
            
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion a MongoDB: "+ex.toString());
        }
        return new Conexion(mongo,dataB);
    }


    
    
    

    
    
    
    

    
    
}
