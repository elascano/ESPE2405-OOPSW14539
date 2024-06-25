import fs from 'fs';
export class FileManager {
    static async save(data, fileName, type) {
        if (type !== "csv" && type !== "txt" && type !== "json") {
            throw new Error("Unsupported file type: " + type);
        }
        if (!fileName.toLowerCase().endsWith("." + type)) {
            fileName += "." + type;
        }     
        
        try {
            await fs.promises.appendFile(fileName, data + "\n");
        } catch (err) {
            console.error("Error writing to file: " + err.message);
            throw err;
        }
    }
}