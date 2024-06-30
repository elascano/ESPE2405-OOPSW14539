class Table {
    constructor(id, name, size, material) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.material = material;
    }
}
const fs = require('fs');

class FileManager {
    save(data, fileName) {
        fs.writeFileSync(fileName, JSON.stringify(data, null, 2));
    }

    read(fileName) {
        const rawData = fs.readFileSync(fileName);
        return JSON.parse(rawData);
    }
}
const readline = require('readline');

class TableSystem {
    constructor() {
        this.fileManager = new FileManager();
    }

    async getUserInput(prompt) {
        const rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });

        return new Promise((resolve) => {
            rl.question(prompt, (answer) => {
                rl.close();
                resolve(answer);
            });
        });
    }

    async createTable() {
        const id = await this.getUserInput("Enter table ID: ");
        const name = await this.getUserInput("Enter table name: ");
        const size = await this.getUserInput("Enter table size: ");
        const material = await this.getUserInput("Enter table material: ");

        return new Table(parseInt(id), name, parseFloat(size), material);
    }

    async run() {
        const table = await this.createTable();
        const fileName = 'tables.json';

        let tables = [];
        try {
            tables = this.fileManager.read(fileName);
        } catch (error) {
            console.log("Creating new file...");
        }

        tables.push(table);
        this.fileManager.save(tables, fileName);

        console.log("Table saved successfully!");
    }
}
(async () => {
    const system = new TableSystem();
    await system.run();
})();
