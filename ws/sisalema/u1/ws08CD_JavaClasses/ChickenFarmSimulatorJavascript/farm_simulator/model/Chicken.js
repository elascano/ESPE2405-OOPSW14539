export class Chicken {
    constructor(id, name, color, molting, bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.molting = molting;
        this.bornOnDate = new Date(bornOnDate);
        this.age = this.calculationAge();
    }
    
    calculationAge() {
        let today = new Date();
        let age = today.getFullYear() - this.bornOnDate.getFullYear();
        let month = today.getMonth() - this.bornOnDate.getMonth();
        if (month < 0 || (month === 0 && today.getDate() < this.bornOnDate.getDate())) {
            age--;
        }
        return age;
    }

    toString(type) {
        let chickenData = "";
        if (type === "csv") { // csv
            chickenData = "Chicken, " + this.id + ", " + this.name + ", " + this.color + ", " 
                        + this.calculationAge() + ", " + this.molting + ", " 
                        + this.bornOnDate;
        } else if (type === "txt") { // txt
            chickenData = "Chicken {id=" + this.id + ", name=" + this.name + ", color=" + this.color 
                        + ", age=" + this.calculationAge() + ", molting=" + this.molting 
                        + ", BornOnDate=" + this.bornOnDate + "}";
        } else if (type === "json") { // json
            chickenData = "{\n"
                        + "  \"Chicken\": {\n"
                        + "    \"id\": " + this.id + ",\n"
                        + "    \"name\": \"" + this.name + "\",\n"
                        + "    \"color\": \"" + this.color + "\",\n"
                        + "    \"age\": " + this.calculationAge() + ",\n"
                        + "    \"molting\": " + this.molting + ",\n"
                        + "    \"BornOnDate\": \"" + this.bornOnDate + "\"\n"
                        + "  }\n"
                        + "}";
        }
        return chickenData;
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

    getAge() {
        return this.age;
    }

    setAge(age) {
        this.age = age;
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
        this.age = this.calculationAge();
    }    
}
