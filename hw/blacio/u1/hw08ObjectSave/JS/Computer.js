const Tax = require('./Tax');

class Computer {
    constructor(id, brand, basePrice) {
        this.id = id;
        this.brand = brand;
        this.basePrice = basePrice;
        this.pvp = this.calculatePvp(basePrice);
    }

    calculatePvp(basePrice) {
        let iva = Tax.computeIva(15.0, basePrice);
        let ice = Tax.computeIce(0.5, basePrice);  // ICE del 0.5%
        return basePrice + iva + ice;
    }

    toString() {
        return `Computer{id=${this.id}, brand=${this.brand}, basePrice=${this.basePrice}, pvp=${this.pvp}}`;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getBrand() {
        return this.brand;
    }

    setBrand(brand) {
        this.brand = brand;
    }

    getBasePrice() {
        return this.basePrice;
    }

    setBasePrice(basePrice) {
        this.basePrice = basePrice;
        this.pvp = this.calculatePvp(basePrice);  // Recalcular PVP cuando cambia el precio base
    }

    getPvp() {
        return this.pvp;
    }

    setPvp() {
        this.pvp = this.calculatePvp(this.basePrice);
    }
}

module.exports = Computer;
