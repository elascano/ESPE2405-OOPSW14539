<<<<<<< HEAD
export class ChickenFarmen {
    constructor(id, name, coops) {
        this.id = id;
        this.name = name;
        this.coops = coops;
    }
    
    toString(type) {
        let chickenFarmer = "";
        if (this.coops != null) {
            for (let coop of this.coops) {
                chickenFarmer += coop.toString(type) + "\n";
            }
        }
        
        let chickenData = "";
        if (type === "csv") { // csv
            chickenData = "ChickenFarmen, id=" + this.id + ", name=" + this.name + ", \n" 
                        + chickenFarmer;
        } else if (type === "txt") { // txt
            chickenData = "ChickenFarmen: id=" + this.id + ", name=" + this.name + ": \n" 
                        + chickenFarmer + "\n";
        } else if (type === "json") { // json
            chickenData = "{\n"
                        + "  \"ChickenFarmen\": {\n"
                        + "    \"id\": \"" + this.id + "\",\n"
                        + "    \"name\": \"" + this.name + "\",\n"
                        + "    \"chickenFarmer\": [\n"
                        + chickenFarmer + "\n"
                        + "    ]\n"
                        + "  }\n"
                        + "}\n";
        }
        return chickenData;
    }
    
    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getCoops() {
        return this.coops;
    }

    setCoops(coops) {
        this.coops = coops;
    }
}
=======
export class ChickenFarmen {
    constructor(id, name, coops) {
        this.id = id;
        this.name = name;
        this.coops = coops;
    }
    
    toString(type) {
        let chickenFarmer = "";
        if (this.coops != null) {
            for (let coop of this.coops) {
                chickenFarmer += coop.toString(type) + "\n";
            }
        }
        
        let chickenData = "";
        if (type === "csv") { // csv
            chickenData = "ChickenFarmen, id=" + this.id + ", name=" + this.name + ", \n" 
                        + chickenFarmer;
        } else if (type === "txt") { // txt
            chickenData = "ChickenFarmen: id=" + this.id + ", name=" + this.name + ": \n" 
                        + chickenFarmer + "\n";
        } else if (type === "json") { // json
            chickenData = "{\n"
                        + "  \"ChickenFarmen\": {\n"
                        + "    \"id\": \"" + this.id + "\",\n"
                        + "    \"name\": \"" + this.name + "\",\n"
                        + "    \"chickenFarmer\": [\n"
                        + chickenFarmer + "\n"
                        + "    ]\n"
                        + "  }\n"
                        + "}\n";
        }
        return chickenData;
    }
    
    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getCoops() {
        return this.coops;
    }

    setCoops(coops) {
        this.coops = coops;
    }
}
>>>>>>> 8e40484f0077d7fe10786aa1aa0f3cc51debe068
