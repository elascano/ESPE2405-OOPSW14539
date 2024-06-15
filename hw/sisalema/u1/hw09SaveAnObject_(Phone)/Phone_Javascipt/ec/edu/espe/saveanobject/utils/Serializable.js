import { Clock } from "model./Clock.js";
import readlineSync from 'readline-sync';
import fs from 'fs';
export class Serializable {
    static createClock(clocks) {
        let id = readlineSync.question("Enter the id: ");
        let clockType = readlineSync.question("Enter the clock type (Analog/Digital/Smartwatch/Hybrid): ");
        let brand = readlineSync.question("Enter the brand (Rolex/Omega/Cartier/IWC/Blancpain): ");
        let model = readlineSync.question("Enter the model (Seamaster/Santos/Tank): ");
        let displayType = readlineSync.question("Enter the display type (LCD/AMOLED/E-ink): ");

        let clock = new Clock(id, clockType, brand, model, displayType);
        clocks.push(clock);
    }
    
        static read(clocks) {
            let continueInput = true;
            do {
                console.log("1. Read individual clock");
                console.log("2. Read all clocks");
                console.log("3. Exit");
                let option = readlineSync.question("Choose an option: ");
    
                switch (option) {
                    case "1":
                        Serializable.readIndividualClock(clocks);
                        break;
                    case "2":
                        Serializable.readGeneralClock(clocks);
                        break;
                    case "3":
                        continueInput = false;
                        break;
                    default:
                        console.log("Invalid option. Please try again.");
                }
            } while (continueInput);
        }
    
        static readClocksFromFile(filename) {
            try {
                const data = fs.readFileSync(filename);
                const clocks = JSON.parse(data);
                console.log("--> \n" + JSON.stringify(clocks) + "\n");
                return clocks;
            } catch (e) {
                console.log("Error reading clock objects: " + e.message);
            }
        }
        static saveClocksToFile(clocks, filename) {
            const json = JSON.stringify(clocks);
            fs.writeFileSync(filename, json);
            console.log(`Clocks saved to ${filename}`);
        }
    
        static readIndividualClock(clocks) {
            let id = readlineSync.question("Enter clock id to read the object: ");
            let clock = clocks.find(clock => clock.id === id);
            if (clock) {
                console.log("--> " + JSON.stringify(clock));
            } else {
                console.log("Clock not found.");
            }
        }
    
        static readGeneralClock(clocks) {
            Serializable.saveClocksToFile(clocks, 'clocks.txt');
            Serializable.readClocksFromFile('clocks.txt');
        }
    }
