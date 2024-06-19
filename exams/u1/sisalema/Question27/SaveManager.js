import fs from 'fs';
import {Truck} from './Truck.js';
import readline from 'readline';

export class SaveManager {
    static enterData() {
        const rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });

        return new Promise((resolve) => {
            rl.question('Enter the truck ID: ', (id) => {
                rl.question('Enter the truck brand: ', (brand) => {
                    rl.question('Enter the truck model: ', (model) => {
                        rl.question('Enter the truck cargo capacity: ', (cargoCapacity) => {
                            rl.close();
                            resolve(new Truck(id, brand, model, parseInt(cargoCapacity)));
                        });
                    });
                });
            });
        });
    }

    static readJSONFile() {
        try {
            const data = fs.readFileSync('trucks.json');
            return JSON.parse(data);
        } catch (err) {
            return [];
        }
    }

    static writeJSONFile(trucks) {
        const data = JSON.stringify(trucks, null, 2);
        fs.writeFileSync('trucks.json', data);
    }

    static async showMenu() {
        const rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });

        const trucks = SaveManager.readJSONFile();

        while (true) {
            console.log('Select an option:');
            console.log('1. Enter a new truck');
            console.log('2. View trucks');
            console.log('3. Exit');
            
            const response = await new Promise((resolve) => {
                rl.question('Option: ', (option) => {
                    resolve(option);
                });
            });

            switch (response) {
                case '1':
                    const newTruck = await SaveManager.enterData();
                    trucks.push(newTruck);
                    SaveManager.writeJSONFile(trucks);
                    console.log('Truck added successfully.');
                    break;
                case '2':
                    console.log('Existing trucks:');
                    trucks.forEach((truck) => {
                        console.log(truck.toString());
                    });
                    break;
                case '3':
                    rl.close();
                    return;
                default:
                    console.log('Invalid option. Try again.');
            }
        }
    }
}