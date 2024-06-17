class Book {
    constructor(title, author, year, publisher, genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
    }

    toString() {
        return `${this.title} by ${this.author}, ${this.year}, ${this.publisher}, ${this.genre}`;
    }
}

module.exports = Book;
