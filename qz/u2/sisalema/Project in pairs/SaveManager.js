import fs from 'fs';
export class SaveManager {
    static loadFromJSON(type) {
        const filename = `${type}.json`;
        try {
            const data = fs.readFileSync(filename);
            return JSON.parse(data);
        } catch (err) {
            return [];
        }
    }
    static saveToJSON(data, type) {
        const filename = `${type}.json`;
        const jsonData = JSON.stringify(data, null, 2);
        fs.writeFileSync(filename, jsonData);
    }
}   