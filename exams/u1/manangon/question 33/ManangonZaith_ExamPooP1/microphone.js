const fs = require('fs');
const readline = require('readline');

// Define the Microphone class
class Microphone {
    constructor(id, brand, model, price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
}

// Create a list to store Microphone objects
let microphoneList = [];

// Function to save the list of microphones to a JSON file
function saveToJson(filename, list) {
    let listDict = list.map(microphone => ({
        id: microphone.id,
        brand: microphone.brand,
        model: microphone.model,
        price: microphone.price
    }));

    fs.writeFile(filename, JSON.stringify(listDict, null, 4), (err) => {
        if (err) {
            console.error('Error saving JSON file', err);
        } else {
            console.log(`Microphone list saved to ${filename}`);
        }
    });
}

// Function to read the list of microphones from a JSON file
function readFromJson(filename) {
    if (fs.existsSync(filename)) {
        const data = fs.readFileSync(filename);
        const listDict = JSON.parse(data);
        microphoneList = listDict.map(obj => new Microphone(obj.id, obj.brand, obj.model, obj.price));
        console.log(`Microphone list read from ${filename}`);
    } else {
        console.error(`The file ${filename} does not exist.`);
    }
}

function enterData() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question('Enter ID: ', (id) => {
        rl.question('Enter brand: ', (brand) => {
            rl.question('Enter model: ', (model) => {
                rl.question('Enter price: ', (price) => {
                    microphoneList.push(new Microphone(parseInt(id), brand, model, parseFloat(price)));
                    rl.close();
                    saveToJson('microphones.json', microphoneList);
                });
            });
        });
    });
}

readFromJson('microphones.json');

enterData();
