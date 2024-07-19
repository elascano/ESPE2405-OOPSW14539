class Owner {
    constructor() {
        this.customers = [];
    }

    addCustomer(customer) {
        this.customers.push(customer);
    }

    findCustomer(id) {
        return this.customers.find(customer => customer.id === id);
    }

    removeCustomer(id) {
        const index = this.customers.findIndex(customer => customer.id === id);
        if (index !== -1) {
            this.customers.splice(index, 1);
            return true;
        }
        return false;
    }
}

export default Owner;
