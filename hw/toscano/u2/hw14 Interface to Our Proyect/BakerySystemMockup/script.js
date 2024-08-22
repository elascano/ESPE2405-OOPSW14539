document.getElementById('addProductBtn').addEventListener('click', function() {
    document.getElementById('addProductForm').style.display = 'block';
    document.getElementById('createBillForm').style.display = 'none';
});

document.getElementById('createBillBtn').addEventListener('click', function() {
    document.getElementById('addProductForm').style.display = 'none';
    document.getElementById('createBillForm').style.display = 'block';
});

document.getElementById('saveProductBtn').addEventListener('click', function() {
    alert('Producto añadido con éxito (mock)!');
});

document.getElementById('createBillBtn').addEventListener('click', function() {
    const billNumber = document.getElementById('billNumber').value;
    const consumerName = document.getElementById('consumerName').value;
    
    const bill = {
        billNumber: billNumber,
        consumerName: consumerName,
        date: new Date().toISOString(),
        products: [] // Mock product list
    };
    
    const billJson = JSON.stringify(bill, null, 2);
    document.getElementById('billJsonOutput').value = billJson;
    alert('Factura creada con éxito (mock)!');
});
