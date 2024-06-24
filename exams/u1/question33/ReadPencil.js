class ReadPencil {
    static read(filename) {
        try {
            const jsonString = fs.readFileSync(filename, 'utf8'); 
            const pencilData = JSON.parse(jsonString);
            return new Pencil(pencilData.id, pencilData._brand, pencilData._color, pencilData._length);
        } catch (error) {
            throw new Error(`Error reading ${filename}: ${error.message}`);
        }
    }
}