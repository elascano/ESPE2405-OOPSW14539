import fs from 'fs';

class FileManager {
    static saveInJson(filePath, data) {
        fs.writeFileSync(filePath, JSON.stringify(data, null, 2));
    }

    static readInJson(filePath) {
        if (!fs.existsSync(filePath)) {
            return [];
        }
        const data = fs.readFileSync(filePath);
        return JSON.parse(data);
    }
}

export default FileManager;
