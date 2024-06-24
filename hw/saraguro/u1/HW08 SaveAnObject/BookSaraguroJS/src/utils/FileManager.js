const fs = require('fs');

class FileManager {
    static loadBooksFromFile(filename) {
        if (!fs.existsSync(filename)) {
            fs.writeFileSync(filename, '[]', 'utf8');
        }

        const data = fs.readFileSync(filename, 'utf8');
        return JSON.parse(data);
    }

    static saveBooksToFile(filename, books) {
        const data = JSON.stringify(books, null, 2);
        fs.writeFileSync(filename, data, 'utf8');
    }
}

module.exports = FileManager;
