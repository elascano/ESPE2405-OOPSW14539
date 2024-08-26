const fs = require('fs');
const path = require('path');
const readlineSync = require('readline-sync');

class CompactDisc {
    constructor(id, title, artist, genre, releaseDate) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }
}

class JsonUtil {
    static writeCompactDiscsToJson(cds, filename) {
        fs.writeFileSync(path.resolve(__dirname, filename), JSON.stringify(cds, null, 2));
    }

    static readCompactDiscsFromJson(filename) {
        try {
            const data = fs.readFileSync(path.resolve(__dirname, filename), 'utf8');
            return JSON.parse(data);
        } catch (error) {
            console.error(error);
            return [];
        }
    }
}

function main() {
    const filename = 'compact_discs.json';
    let cds = JsonUtil.readCompactDiscsFromJson(filename);

    function menu() {
        console.log(`
            1. Add Compact Disc
            2. View Compact Discs
            3. Save and Exit
            4. Check Student Status
        `);
        const option = readlineSync.question('Choose an option: ');

        switch (option) {
            case '1':
                addCompactDisc();
                break;
            case '2':
                viewCompactDiscs();
                break;
            case '3':
                saveAndExit();
                break;
            case '4':
                checkStudentStatus();
                break;
            default:
                console.log('Invalid option. Please try again.');
                menu();
                break;
        }
    }

    function addCompactDisc() {
        const id = readlineSync.question('Enter CD ID: ');
        const title = readlineSync.question('Enter CD Title: ');
        const artist = readlineSync.question('Enter Artist: ');
        const genre = readlineSync.question('Enter Genre: ');
        const releaseDate = readlineSync.question('Enter Release Date: ');
        const cd = new CompactDisc(id, title, artist, genre, releaseDate);
        cds.push(cd);
        console.log('Compact Disc added successfully.');
        menu();
    }

    function viewCompactDiscs() {
        if (cds.length === 0) {
            console.log('No compact discs available.');
        } else {
            cds.forEach(cd => {
                console.log(`
                    ID: ${cd.id}
                    Title: ${cd.title}
                    Artist: ${cd.artist}
                    Genre: ${cd.genre}
                    Release Date: ${cd.releaseDate}
                `);
            });
        }
        menu();
    }

    function saveAndExit() {
        JsonUtil.writeCompactDiscsToJson(cds, filename);
        console.log('Data saved. Exiting...');
    }

    function checkStudentStatus() {
        console.log('Checking student status...');
        menu();
    }

    menu();
}

main();

//para entrar, entrar en la terminal, y poner node compactDiscManager.js, para que se vea Edison!