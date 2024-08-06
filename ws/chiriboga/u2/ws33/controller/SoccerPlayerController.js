const { MongoClient } = require('mongodb');

class SoccerPlayerController {
  constructor() {
    this.uri = "mongodb+srv://kachiriboga:chiriboga@cluster0.mstbyy5.mongodb.net/";
    this.client = new MongoClient(this.uri, { useNewUrlParser: true, useUnifiedTopology: true });
    this.database = this.client.db("Soccer");
    this.collection = this.database.collection("SoccerPlayers");
  }

  async connect() {
    try {
      await this.client.connect();
      console.log("Connected to MongoDB");
    } catch (e) {
      console.error(e);
    }
  }

  async createPlayer(soccerPlayer) {
    const doc = {
      id: soccerPlayer.id,
      nombre: soccerPlayer.name,
      edad: soccerPlayer.age,
      goles: soccerPlayer.goals,
      partidosJugados: soccerPlayer.matchesPlayed,
      'promedio de goles por partido': soccerPlayer.calculateGoalsAverage(),
      'eficiencia ofensiva': soccerPlayer.calculateOffensiveEfficiency()
    };

    try {
      await this.collection.insertOne(doc);
      console.log("Soccer player inserted successfully");
    } catch (e) {
      console.error(e);
    }
  }
}

module.exports = SoccerPlayerController;

