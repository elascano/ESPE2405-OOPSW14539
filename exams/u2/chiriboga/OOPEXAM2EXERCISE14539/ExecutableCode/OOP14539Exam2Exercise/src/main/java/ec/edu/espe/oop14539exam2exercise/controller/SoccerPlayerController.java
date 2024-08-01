package ec.edu.espe.oop14539exam2exercise.controller;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.oop14539exam2exercise.model.SoccerPlayer;
import org.bson.Document;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class SoccerPlayerController {

    private MongoCollection<Document> collection;

    public SoccerPlayerController() {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://kachiriboga:chiriboga@cluster0.mstbyy5.mongodb.net/");
        MongoDatabase database = mongoClient.getDatabase("Soccer");
        collection = database.getCollection("SoccerPlayers");
   }

    public void createPlayer(SoccerPlayer soccerPlayer) {
        Document doc = new Document("id", soccerPlayer.getId())
                .append("nombre", soccerPlayer.getName())
                .append("edad", soccerPlayer.getAge())
                .append("goles", soccerPlayer.getGoals())
                .append("partidosJugados", soccerPlayer.getMatchesPlayed())
                .append("promedio de goles por partido", soccerPlayer.calculateGoalsAverage())
                .append("eficiencia ofensiva",soccerPlayer.calculateOffensiveEfficiency());

        collection.insertOne(doc);
    }

}
