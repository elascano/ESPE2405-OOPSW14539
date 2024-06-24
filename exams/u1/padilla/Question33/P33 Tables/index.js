const fs = require('fs');

// Clase Table
class Table {
    constructor(id, name, material, dimensions) {
        this.id = id;
        this.name = name;
        this.material = material;
        this.dimensions = dimensions;
    }
}

// ArrayList para almacenar objetos Table
let tables = [];

// Función para agregar una nueva tabla
function addTable(id, name, material, dimensions) {
    const table = new Table(id, name, material, dimensions);
    tables.push(table);
}

// Función para guardar las tablas en un archivo JSON
function saveTablesToFile(filename) {
    const data = JSON.stringify(tables, null, 2);
    fs.writeFileSync(filename, data, 'utf-8');
    console.log('Tables have been saved to ' + filename);
}

// Función para cargar tablas desde un archivo JSON
function loadTablesFromFile(filename) {
    const data = fs.readFileSync(filename, 'utf-8');
    tables = JSON.parse(data);
    console.log('Tables have been loaded from ' + filename);
}

// Ejemplo de uso
addTable(1, 'Dining Table', 'Wood', { length: 200, width: 100, height: 75 });
addTable(2, 'Coffee Table', 'Glass', { length: 100, width: 50, height: 45 });

// Guardar tablas en archivo JSON
saveTablesToFile('tables.json');

// Cargar tablas desde archivo JSON
loadTablesFromFile('tables.json');

// Mostrar tablas cargadas
console.log(tables);
