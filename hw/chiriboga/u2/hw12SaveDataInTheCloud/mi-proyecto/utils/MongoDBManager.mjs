// utils/MongoDBManager.mjs
import { MongoClient } from 'mongodb';

const url = 'mongodb+srv://kachiriboga:chiriboga@cluster0.mstbyy5.mongodb.net/Customers'; // Cambia 'tu_nombre_base_de_datos' por el nombre de tu base de datos
const dbName = 'Customers'; 
let db;

export async function connectToMongoDB() {
    try {
        const client = new MongoClient(url);
        await client.connect();
        db = client.db(dbName);
        console.log('Conectado a MongoDB');
    } catch (error) {
        console.error('Error al conectar a MongoDB:', error);
    }
}

export function getDb() {
    if (!db) {
        throw new Error('La conexión a la base de datos no está inicializada');
    }
    return db;
}

export async function saveCustomersToMongoDB(customers) {
    try {
        const collection = getDb().collection('customers');
        await collection.deleteMany({}); // Borrar todos los registros existentes
        await collection.insertMany(customers);
        console.log('Clientes guardados en MongoDB');
    } catch (error) {
        console.error('Error al guardar clientes en MongoDB:', error);
    }
}

export async function readCustomersFromMongoDB() {
    try {
        const collection = getDb().collection('customers');
        const customers = await collection.find({}).toArray();
        console.log('Clientes leídos desde MongoDB');
        return customers;
    } catch (error) {
        console.error('Error al leer clientes desde MongoDB:', error);
        return [];
    }
}
