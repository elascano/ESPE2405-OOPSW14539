class Customer {
    constructor(id, name, cellPhone, abono = 0) {
        this.id = id;
        this.name = name;
        this.cellPhone = cellPhone;
        this.abono = abono;
        this.clothes = [];
    }

    buy(clothe) {
        if (this.abono < clothe.price) {
            console.log('Fondos insuficientes para realizar la compra.');
            return false;
        }
        this.abono -= clothe.price;
        this.clothes.push(clothe);
        return true;
    }

    credit(amount) {
        this.abono += amount;
    }

    calculateTotalAmount() {
        return this.clothes.reduce((total, clothe) => total + clothe.price, 0);
    }
}

export default Customer;
