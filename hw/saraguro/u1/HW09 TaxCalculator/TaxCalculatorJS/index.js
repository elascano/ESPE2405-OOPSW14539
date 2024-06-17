const EmployeeMenu = require('./src/controller/EmployeeMenu');

console.log("Iniciando programa...");

// Crear una instancia de EmployeeMenu y llamar a showMenu()
const controller = new EmployeeMenu();
controller.showMenu();

console.log("Programa finalizado.");
