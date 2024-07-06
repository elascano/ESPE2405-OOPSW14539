const fs = require('fs');
const readline = require('readline');

// Clase Computer
class Computer {
    constructor(id, brand, model, processor, price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.price = price;
    }
}

// Clase Stock
class Stock {
    constructor(id, location) {
        this.id = id;
        this.location = location;
        this.computers = [];
    }

    addComputer(computer) {
        this.computers.push(computer);
        console.log('Computer added to stock successfully.');
    }

    showComputers() {
        console.log(`Computers in stock ${this.location}:`);
        console.log(this.computers);
    }
}

// ArrayList para almacenar objetos Stock
let stocks = [];

// Función para agregar una nueva computadora a un stock
function addComputerToStock(stockId, id, brand, model, processor, price) {
    const computer = new Computer(id, brand, model, processor, price);
    let stock = stocks.find(s => s.id == stockId);
    if (stock) {
        stock.addComputer(computer);
    } else {
        console.log('Stock not found for the given stockId.');
    }
}

// Función para guardar los stocks y sus computadoras en un archivo JSON
function saveStocksToFile(filename) {
    const data = JSON.stringify(stocks, null, 2);
    fs.writeFileSync(filename, data, 'utf-8');
    console.log('Stocks and computers have been saved to ' + filename);
}

// Función para cargar stocks y sus computadoras desde un archivo JSON
function loadStocksFromFile(filename) {
    const data = fs.readFileSync(filename, 'utf-8');
    const parsedData = JSON.parse(data);
    stocks = parsedData.map(stockData => {
        const stock = new Stock(stockData.id, stockData.location);
        stock.computers = stockData.computers.map(comp => new Computer(comp.id, comp.brand, comp.model, comp.processor, comp.price));
        return stock;
    });
    console.log('Stocks and computers have been loaded from ' + filename);
}

// Función para mostrar los stocks y sus computadoras
function showStocks() {
    console.log('Current stocks:');
    stocks.forEach(stock => stock.showComputers());
}

// Interfaz de lectura para el menú
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function showMenu() {
    console.log('\nMenu:');
    console.log('1. Add Computer to Stock');
    console.log('2. Save Stocks and Computers to File');
    console.log('3. Load Stocks and Computers from File');
    console.log('4. Show Stocks and Computers');
    console.log('5. Add Stock');
    console.log('6. Exit');
    rl.question('Choose an option: ', function(option) {
        switch (option) {
            case '1':
                rl.question('Enter stock ID: ', function(stockId) {
                    rl.question('Enter computer ID: ', function(id) {
                        rl.question('Enter computer brand: ', function(brand) {
                            rl.question('Enter computer model: ', function(model) {
                                rl.question('Enter computer processor: ', function(processor) {
                                    rl.question('Enter computer price: ', function(price) {
                                        addComputerToStock(stockId, id, brand, model, processor, price);
                                        showMenu();
                                    });
                                });
                            });
                        });
                    });
                });
                break;
            case '2':
                rl.question('Enter filename to save stocks and computers: ', function(filename) {
                    saveStocksToFile(filename);
                    showMenu();
                });
                break;
            case '3':
                rl.question('Enter filename to load stocks and computers: ', function(filename) {
                    loadStocksFromFile(filename);
                    showMenu();
                });
                break;
            case '4':
                showStocks();
                showMenu();
                break;
            case '5':
                rl.question('Enter stock ID: ', function(id) {
                    rl.question('Enter stock location: ', function(location) {
                        const stock = new Stock(id, location);
                        stocks.push(stock);
                        console.log('Stock added successfully.');
                        showMenu();
                    });
                });
                break;
            case '6':
                rl.close();
                break;
            default:
                console.log('Invalid option. Please try again.');
                showMenu();
                break;
        }
    });
}

// Mostrar el menú inicial
showMenu();
