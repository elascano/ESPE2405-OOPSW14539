const readlineSync = require('readline-sync');
const FileManager = require('./fileManager');
const Book = require('./book');

class LibraryManager {
    constructor(filename) {
        this.filename = filename;
        this.books = FileManager.loadBooksFromFile(filename);
    }

    run() {
        let option;

        do {
            console.log("\nWelcome to the Library System");
            console.log("1. Add Book");
            console.log("2. Display All Books");
            console.log("3. Delete Book");
            console.log("4. Save and Exit");
            option = readlineSync.question("Choose an option: ");

            switch (option) {
                case '1':
                    this.addBook();
                    break;
                case '2':
                    this.displayAllBooks();
                    break;
                case '3':
                    this.deleteBook();
                    break;
                case '4':
                    FileManager.saveBooksToFile(this.filename, this.books);
                    console.log("Books saved. Exiting...");
                    break;
                default:
                    console.log("Invalid option. Please try again.");
            }
        } while (option !== '4');
    }

    addBook() {
        const title = readlineSync.question("Enter title: ");
        const author = readlineSync.question("Enter author: ");
        const year = readlineSync.questionInt("Enter year: ");
        const publisher = readlineSync.question("Enter publisher: ");
        const genre = readlineSync.question("Enter genre: ");

        const book = new Book(title, author, year, publisher, genre);
        this.books.push(book);
    }

    displayAllBooks() {
        if (this.books.length === 0) {
            console.log("No books to display.");
            return;
        }
        this.books.forEach((book, index) => {
            console.log(`${index + 1}. ${book.toString()}`);
        });
    }

    deleteBook() {
        this.displayAllBooks();
        if (this.books.length === 0) {
            return;
        }

        const index = readlineSync.questionInt("Enter the number of the book to delete: ") - 1;

        if (index < 0 || index >= this.books.length) {
            console.log("Invalid book number.");
            return;
        }

        const removedBook = this.books.splice(index, 1);
        console.log(`Book removed: ${removedBook[0].title}`);
    }
}

module.exports = LibraryManager;
