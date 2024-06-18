class Chicken {
    constructor(id, name, color, molting, bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.molting = molting;
        this.bornOnDate = new Date(bornOnDate);
    }

    toString(type = 2) {
        let chickenData = '';
        if (type === 1) { // csv
            chickenData = `${this.id},${this.name},${this.color},${this.getAge()},${this.molting},${this.bornOnDate}`;
        } else if (type === 2) { // txt
            chickenData = `Chicken{id=${this.id}, name=${this.name}, color=${this.color}, age=${this.getAge()}, molting=${this.molting}, bornOnDate=${this.bornOnDate}}`;
        } else if (type === 3) { // json
            chickenData = `{ "id": ${this.id}, "name": "${this.name}", "color": "${this.color}", "age": ${this.getAge()}, "molting": ${this.molting}, "bornOnDate": "${this.bornOnDate.toISOString()}" }`;
        }
        return chickenData;
    }

    getAge() {
        const birth = new Date(this.bornOnDate);
        const today = new Date();
        let age = today.getFullYear() - birth.getFullYear();
        const m = today.getMonth() - birth.getMonth();
        if (m < 0 || (m === 0 && today.getDate() < birth.getDate())) {
            age--;
        }
        return age;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getName() {
        return this.name;
    }

    setName(name) {
        this.name = name;
    }

    getColor() {
        return this.color;
    }

    setColor(color) {
        this.color = color;
    }
    
    isMolting() {
        return this.molting;
    }

    setMolting(molting) {
        this.molting = molting;
    }

    getBornOnDate() {
        return this.bornOnDate;
    }

    setBornOnDate(bornOnDate) {
        this.bornOnDate = new Date(bornOnDate);
    }
}
