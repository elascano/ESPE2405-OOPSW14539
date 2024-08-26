const readlineSync = require('readline-sync');
const fs = require('fs');

class Mask {
    constructor(id, color, size, material) {
        this.id = id;
        this.color = color;
        this.size = size;
        this.material = material;
    }

    static createMask() {
        let id = readlineSync.question('Enter Mask ID: ');
        let color = readlineSync.question('Enter Mask Color: ');
        let size = readlineSync.question('Enter Mask Size: ');
        let material = readlineSync.question('Enter Mask Material: ');

        return new Mask(id, color, size, material);
    }
}

class MaskManager {
    constructor() {
        this.masks = this.readMasksFromFile();
    }

    addMask(mask) {
        this.masks.push(mask);
        this.saveMasksToFile();
    }

    readMasksFromFile() {
        if (fs.existsSync('masks.json')) {
            let data = fs.readFileSync('masks.json');
            return JSON.parse(data);
        } else {
            console.log('No masks.json file found. Starting with an empty list.');
            return [];
        }
    }

    saveMasksToFile() {
        fs.writeFileSync('masks.json', JSON.stringify(this.masks, null, 2));
        console.log('Masks saved to masks.json file.');
    }
}


const maskManager = new MaskManager();
const newMask = Mask.createMask();
maskManager.addMask(newMask);
