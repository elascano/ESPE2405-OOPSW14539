// view/main.mjs
import readlineSync from 'readline-sync';
import Customer from '../models/Customer.mjs';
import Owner from '../models/Owner.mjs';
import Clothe from '../models/Clothe.mjs';
import FileManager from '../utils/FileManager.mjs';
import { connectToMongoDB, saveCustomersToMongoDB, readCustomersFromMongoDB } from '../utils/MongoDBManager.mjs';

const owner = new Owner();
const dataPath = './data/customers.json';

async function loadCustomers() {
    try {
        const savedCustomers = FileManager.readInJson(dataPath);
        savedCustomers.forEach(c => {
            const customer = new Customer(c.id, c.name, c.cellPhone, c.abono);
            customer.clothes = c.clothes.map(clothe => new Clothe(clothe.id, clothe.price));
            owner.addCustomer(customer);
        });
    } catch (error) {
        console.error('Error al cargar clientes desde archivo JSON:', error);
    }

    try {
        const mongoCustomers = await readCustomersFromMongoDB();
        mongoCustomers.forEach(c => {
            const customer = new Customer(c.id, c.name, c.cellPhone, c.abono);
            customer.clothes = c.clothes.map(clothe => new Clothe(clothe.id, clothe.price));
            owner.addCustomer(customer);
        });
    } catch (error) {
        console.error('Error al cargar clientes desde MongoDB:', error);
    }
}

async function saveCustomers() {
    const customers = owner.customers.map(c => ({
        id: c.id,
        name: c.name,
        cellPhone: c.cellPhone,
        abono: c.abono,
        clothes: c.clothes.map(cl => ({ id: cl.id, price: cl.price }))
    }));

    try {
        FileManager.saveInJson(dataPath, customers);
        console.log('Clientes guardados en archivo JSON');
    } catch (error) {
        console.error('Error al guardar clientes en archivo JSON:', error);
    }

    try {
        await saveCustomersToMongoDB(customers);
    } catch (error) {
        console.error('Error al guardar clientes en MongoDB:', error);
    }
}

async function startApp() {
    await connectToMongoDB();
    await loadCustomers();

    let running = true;
    while (running) {
        showMenu();
        const choice = readlineSync.question('Seleccione una opcion: ');
        switch (choice) {
            case '1':
                addCustomer();
                break;
            case '2':
                console.log('===== Inventario disponible =====');
                console.log('|| 1. Chompas - $12             ||');
                console.log('||      Negro, ID:N1            ||');
                console.log('||      Rojo, ID:R1             ||');
                console.log('||      Blanco, ID:B1           ||');
                console.log('||      Cafe, ID:C1             ||');
                console.log(' ================================ ');
                console.log('|| 2. Pantalones - $15          ||');
                console.log('||      Jean, ID:J2             ||');
                console.log('||      Tela, ID:T2             ||');
                console.log('||      Jogger, ID:JG2          ||');
                console.log('||      Pijama, ID:P2           ||');
                console.log(' ================================ ');
                console.log('|| 3. Camisetas -  $5           ||');
                console.log('||      Llana, ID:L3            ||');
                console.log('||      Estampada,  ID:E3       ||');
                console.log('||      Oversize, ID:O3         ||');
                console.log('||      Deportiva,  ID:D3       ||');
                console.log(' ================================ ');
                console.log('|| 4. Vestidos - $20            ||');
                console.log('||      Flores, ID:F4           ||');
                console.log('||      Cuadriculado, ID:C4     ||');
                console.log('||      Liso, ID:L4             ||');
                console.log('||      Plisado, ID:PL4         ||');
                console.log('==================================');
                buyClothe();
                break;
            case '3':
                credit();
                break;
            case '4':
                showCustomers();
                break;
            case '5':
                calculateTotalAmount();
                break;
            case '6':
                removeCustomer();
                break;
            case '7':
                running = false;
                console.log('Saliendo del programa...');
                break;
            default:
                console.log('Opción no válida. Inténtelo de nuevo.');
        }
    }
}

function showMenu() {
    console.log('\n  ===== Bienvenido al Simulador de Ventas! =====');
    console.log(' ||          1. Agregar Cliente                 ||');
    console.log(' ||          2. Comprar Ropa                    ||');
    console.log(' ||          3. Abonar                          ||');
    console.log(' ||          4. Mostrar Clientes                ||');
    console.log(' ||          5. Calcular Monto Total a Pagar    ||');
    console.log(' ||          6. Eliminar Cliente                ||');
    console.log(' ||          7. Salir                           ||');
    console.log('  ===============================================');
}

function addCustomer() {
    const id = readlineSync.question('Ingrese ID del cliente: ');
    const name = readlineSync.question('Ingrese nombre del cliente: ');
    const cellPhone = readlineSync.question('Ingrese telefono del cliente: ');
    const customer = new Customer(id, name, cellPhone);
    owner.addCustomer(customer);
    saveCustomers();
    console.log('Cliente agregado exitosamente.');
}

function buyClothe() {
    const customerId = readlineSync.question('Ingrese ID del cliente: ');
    const customer = owner.findCustomer(customerId);
    if (!customer) {
        console.log('Cliente no encontrado.');
        return;
    }
    const clotheId = readlineSync.question('Ingrese ID de la ropa: ');
    const price = parseFloat(readlineSync.question('Ingrese el precio de la ropa: '));
    const clothe = new Clothe(clotheId, price);
    if (customer.buy(clothe)) {
        saveCustomers();
        console.log('Compra realizada exitosamente.');
    } else {
        console.log('Compra fallida. Fondos insuficientes.');
    }
}

function credit() {
    const customerId = readlineSync.question('Ingrese ID del cliente: ');
    const customer = owner.findCustomer(customerId);
    if (!customer) {
        console.log('Cliente no encontrado.');
        return;
    }
    const amount = parseFloat(readlineSync.question('Ingrese el monto a abonar: '));
    customer.credit(amount);
    saveCustomers();
    console.log('Abono realizado exitosamente.');
}

function showCustomers() {
    if (owner.customers.length === 0) {
        console.log('No hay clientes para mostrar.');
        return;
    }
    owner.customers.forEach(customer => {
        console.log(`ID: ${customer.id}, Nombre: ${customer.name}, Teléfono: ${customer.cellPhone}, Abono: ${customer.abono}, Ropas: ${customer.clothes.map(c => c.id).join(', ')}`);
    });
}

function calculateTotalAmount() {
    const customerId = readlineSync.question('Ingrese ID del cliente: ');
    const customer = owner.findCustomer(customerId);
    if (!customer) {
        console.log('Cliente no encontrado.');
        return;
    }
    const totalAmount = customer.calculateTotalAmount();
    console.log(`El monto total a pagar por ${customer.name} es: ${totalAmount}`);
}

function removeCustomer() {
    const customerId = readlineSync.question('Ingrese ID del cliente a eliminar: ');
    if (owner.removeCustomer(customerId)) {
        saveCustomers();
        console.log('Cliente eliminado exitosamente.');
    } else {
        console.log('Cliente no encontrado.');
    }
}

startApp();
