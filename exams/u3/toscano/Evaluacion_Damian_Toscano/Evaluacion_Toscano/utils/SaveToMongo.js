const { MongoClient } = require('mongodb');

class SaveToMongo {
    constructor() {
        this.connectionString = "mongodb+srv://yasisalema:yasisalema@cluster0.51fic9g.mongodb.net/Exam";
        this.mongoClient = new MongoClient(this.connectionString, { useNewUrlParser: true, useUnifiedTopology: true });
        this.database = null;
        this.collection = null;
        this.init();
    }

    async init() {
        try {
            await this.mongoClient.connect();
            this.database = this.mongoClient.db("Exam");
            this.collection = this.database.collection("sortOperations");
            console.log("Connected to MongoDB");
        } catch (error) {
            console.error("Error connecting to MongoDB:", error);
        }
    }

    async saveSortOperation(unsortedArray, sortedArray, sortType) {
        const doc = {
            unsortedArray: unsortedArray,
            sortedArray: sortedArray,
            sortType: sortType,
            timestamp: new Date()
        };

        try {
            await this.collection.insertOne(doc);
            console.log("Sort operation saved to MongoDB");
        } catch (error) {
            console.error("Error saving sort operation:", error);
        }
    }

    async getAllSortOperations() {
        try {
            const operations = await this.collection.find().toArray();
            return operations;
        } catch (error) {
            console.error("Error retrieving sort operations:", error);
            return [];
        }
    }

    async close() {
        if (this.mongoClient) {
            await this.mongoClient.close();
            console.log("MongoDB connection closed");
        }
    }
}

module.exports = SaveToMongo;
