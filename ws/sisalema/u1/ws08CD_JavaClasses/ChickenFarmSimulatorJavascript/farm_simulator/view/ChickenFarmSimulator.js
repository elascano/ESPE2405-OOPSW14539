<<<<<<< HEAD
import { Chicken } from "../model/Chicken.js";
import { ChickenCoop } from "../model/ChickenCoop.js";
import { ChickenFarmen } from "../model/ChickenFarmen.js";
import { FileManager } from "../utils/FileManager.js";
import promptSync from 'prompt-sync';
const prompt = promptSync();

class ChickenFarmSimulator {
    static async main() {
        console.log("Sisalema's Chicken Farm Simulator");
        let fileType = prompt("Enter file type to save (csv/txt/json): ");
        let numberFarmer = parseInt(prompt("How many chicken farms do you want to put in the system?: "));
        
        let allFarmersData = [];

        for (let j = 0; j < numberFarmer; j++) {
            console.log("Chicken farming Facts:\n" + (j + 1) + ".-Enter farmer ID:");
            let farmerId = parseInt(prompt((j + 1) + ".-Enter farmer ID:"));

            console.log((j + 1) + ".-Enter farmer name: ");
            let farmerName = prompt((j + 1) + ".-Enter farmer name: ").toLowerCase();

            console.log((j + 1) + ".-Number of chicken coop: ");
            let numberCoops = parseInt(prompt((j + 1) + ".-Number of chicken coop: "));

            let coops = [];
            for (let k = 0; k < numberCoops; k++) {
                console.log("Chicken Coop Facts:\n" + (k + 1) + ".-Enter coop ID:");
                let coopId = parseInt(prompt((k + 1) + ".-Enter coop ID:"));

                console.log((k + 1) + ".-Number of chickens: ");
                let numberChicken = parseInt(prompt((k + 1) + ".-Number of chickens: "));

                let chickens = [];
                for (let i = 0; i < numberChicken; i++) {
                    console.log("Chicken Facts:\n" + (i + 1) + ".-Enter chicken ID:");
                    let id = parseInt(prompt((i + 1) + ".-Enter chicken ID:"));

                    console.log((i + 1) + ".-Enter chicken name: ");
                    let name = prompt((i + 1) + ".-Enter chicken name: ").toLowerCase();

                    console.log((i + 1) + ".-Enter chicken color: ");
                    let color = prompt((i + 1) + ".-Enter chicken color: ").toLowerCase();

                    console.log((i + 1) + ".-Is the chicken molting? (true/false): ");
                    let molting = prompt((i + 1) + ".-Is the chicken molting? (true/false): ") === 'true';

                    console.log((i + 1) + ".-Enter chicken birth date (dd/MM/yyyy): ");
                    let bornOnDateString = prompt((i + 1) + ".-Enter chicken birth date (dd/MM/yyyy): ");
                    let bornOnDate = new Date(bornOnDateString.split("/").reverse().join("-"));

                    let chicken = new Chicken(id, name, color, molting, bornOnDate);
                    chickens.push(chicken);
                }
                coops.push(new ChickenCoop(coopId, chickens));
            }

            let chickenFarmen = new ChickenFarmen(farmerId, farmerName, coops);
            allFarmersData.push(chickenFarmen);
        }

        let fileName = "chicken_farms";
        let data = allFarmersData.map(farmer => farmer.toString(fileType)).join("\n");

        try {
            await FileManager.save(data, fileName, fileType);
            console.log(`Data saved successfully in ${fileType} format.`);
        } catch (error) {
            console.error("Error saving file:", error);
        }

        console.log("Could be saved in -->" + fileType);
    }
}

=======
import { Chicken } from "../model/Chicken.js";
import { ChickenCoop } from "../model/ChickenCoop.js";
import { ChickenFarmen } from "../model/ChickenFarmen.js";
import { FileManager } from "../utils/FileManager.js";
import promptSync from 'prompt-sync';
const prompt = promptSync();

class ChickenFarmSimulator {
    static async main() {
        console.log("Sisalema's Chicken Farm Simulator");
        let fileType = prompt("Enter file type to save (csv/txt/json): ");
        let numberFarmer = parseInt(prompt("How many chicken farms do you want to put in the system?: "));
        
        let allFarmersData = [];

        for (let j = 0; j < numberFarmer; j++) {
            console.log("Chicken farming Facts:\n" + (j + 1) + ".-Enter farmer ID:");
            let farmerId = parseInt(prompt((j + 1) + ".-Enter farmer ID:"));

            console.log((j + 1) + ".-Enter farmer name: ");
            let farmerName = prompt((j + 1) + ".-Enter farmer name: ").toLowerCase();

            console.log((j + 1) + ".-Number of chicken coop: ");
            let numberCoops = parseInt(prompt((j + 1) + ".-Number of chicken coop: "));

            let coops = [];
            for (let k = 0; k < numberCoops; k++) {
                console.log("Chicken Coop Facts:\n" + (k + 1) + ".-Enter coop ID:");
                let coopId = parseInt(prompt((k + 1) + ".-Enter coop ID:"));

                console.log((k + 1) + ".-Number of chickens: ");
                let numberChicken = parseInt(prompt((k + 1) + ".-Number of chickens: "));

                let chickens = [];
                for (let i = 0; i < numberChicken; i++) {
                    console.log("Chicken Facts:\n" + (i + 1) + ".-Enter chicken ID:");
                    let id = parseInt(prompt((i + 1) + ".-Enter chicken ID:"));

                    console.log((i + 1) + ".-Enter chicken name: ");
                    let name = prompt((i + 1) + ".-Enter chicken name: ").toLowerCase();

                    console.log((i + 1) + ".-Enter chicken color: ");
                    let color = prompt((i + 1) + ".-Enter chicken color: ").toLowerCase();

                    console.log((i + 1) + ".-Is the chicken molting? (true/false): ");
                    let molting = prompt((i + 1) + ".-Is the chicken molting? (true/false): ") === 'true';

                    console.log((i + 1) + ".-Enter chicken birth date (dd/MM/yyyy): ");
                    let bornOnDateString = prompt((i + 1) + ".-Enter chicken birth date (dd/MM/yyyy): ");
                    let bornOnDate = new Date(bornOnDateString.split("/").reverse().join("-"));

                    let chicken = new Chicken(id, name, color, molting, bornOnDate);
                    chickens.push(chicken);
                }
                coops.push(new ChickenCoop(coopId, chickens));
            }

            let chickenFarmen = new ChickenFarmen(farmerId, farmerName, coops);
            allFarmersData.push(chickenFarmen);
        }

        let fileName = "chicken_farms";
        let data = allFarmersData.map(farmer => farmer.toString(fileType)).join("\n");

        try {
            await FileManager.save(data, fileName, fileType);
            console.log(`Data saved successfully in ${fileType} format.`);
        } catch (error) {
            console.error("Error saving file:", error);
        }

        console.log("Could be saved in -->" + fileType);
    }
}

>>>>>>> 8e40484f0077d7fe10786aa1aa0f3cc51debe068
export { ChickenFarmSimulator };