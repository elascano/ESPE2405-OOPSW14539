// models/Keyboard.js
class Keyboard {
    constructor(id, type, amount, price) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.totalPrice = amount * price;
    }
}

module.exports = Keyboard;
