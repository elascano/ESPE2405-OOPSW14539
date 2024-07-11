const { MongoClient } = require('mongodb');
const readline = require('readline');

const url = 'mongodb+srv://saraguro:saraguro@clusterO.5nyjils.mongodb.net/';
const dbName = 'oop';
const client = new MongoClient(url, { useNewUrlParser: true, useUnifiedTopology: true });

// Función para leer entrada del usuario
function prompt(question) {
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  return new Promise(resolve => rl.question(question, answer => {
    rl.close();
    resolve(answer);
  }));
}

async function addNewBook() {
  try {
    await client.connect();
    console.log('Connected to MongoDB!');

    const db = client.db(dbName);
    const collection = db.collection('books');

    // Solicitar al usuario que ingrese los datos del libro
    const title = await prompt('Enter book title: ');
    const author = await prompt('Enter book author: ');
    const year = parseInt(await prompt('Enter publication year: '));
    const genre = await prompt('Enter genre: ');

    const newBook = {
      title: title,
      author: author,
      year: year,
      genre: genre
    };

    const result = await collection.insertOne(newBook);
    console.log('Book added successfully:', result.insertedId);

  } catch (error) {
    console.error('Error:', error);
  } finally {
    await client.close();
    console.log('Connection closed');
  }
}

addNewBook();
