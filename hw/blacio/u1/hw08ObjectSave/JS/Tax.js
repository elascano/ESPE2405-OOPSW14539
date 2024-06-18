class Tax {
    static computeIva(ivaPercentage, amount) {
        let total;
        total = amount * ivaPercentage / 100;
        return total;
    }

    static computeIce(icePercentage, amount) {
        let total;
        total = amount * icePercentage / 100;
        return total;
    }
}

module.exports = Tax;
