import { Serializable } from "utils./Serializable.js";
import readlineSync from 'readline-sync';

class ClockSystem {
    static main(){          
        let clocks = [];
        let continueInput = true;
        do {
            console.log("1. Create clock");
            console.log("2. Read Clocks");
            console.log("3. Exit");
            let option = readlineSync.question("Choose an option:");
        
            switch (option) {
                case "1":
                    Serializable.createClock(clocks);
                    break;
                case "2":
                    Serializable.read(clocks);
                    break;
                case "3":
                    continueInput = false;
                    break;
                default:
                    console.log("Invalid option. Please try again.");
            }
        } while (continueInput);
    }
}
ClockSystem.main();