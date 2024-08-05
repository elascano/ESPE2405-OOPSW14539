<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a064af6ecab12755c8c8b8a5858b342fd47aa80f
export class ChickenCoop {
    constructor(id, chickensCoop) {
        this.id = id;
        this.chickensCoop = chickensCoop;
    }

    toString(type) {
        let chickensType = "";
        if (this.chickensCoop != null) {
            for (let chicken of this.chickensCoop) {
                chickensType += chicken.toString(type) + "\n";
            }
        }
        
        let chickenData = "";
        if (type === "csv") { // csv
            chickenData = "ChickenCoop, id=" + this.id + ", \n" + chickensType;
        } else if (type === "txt") { // txt
            chickenData = "ChickenCoop: id=" + this.id + ", \n" + chickensType + "\n";
        } else if (type === "json") { // json
            chickenData = "{\"ChickenCoop\": {\"id\": \"" + this.id + "\", \"\n" + chickensType + "\"}}\n";
        }
        return chickenData;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getChickens() {
        return this.chickensCoop;
    }

    setChickens(chickens) {
        this.chickensCoop = chickens;
    }
}
<<<<<<< HEAD
=======
=======
export class ChickenCoop {
    constructor(id, chickensCoop) {
        this.id = id;
        this.chickensCoop = chickensCoop;
    }

    toString(type) {
        let chickensType = "";
        if (this.chickensCoop != null) {
            for (let chicken of this.chickensCoop) {
                chickensType += chicken.toString(type) + "\n";
            }
        }
        
        let chickenData = "";
        if (type === "csv") { // csv
            chickenData = "ChickenCoop, id=" + this.id + ", \n" + chickensType;
        } else if (type === "txt") { // txt
            chickenData = "ChickenCoop: id=" + this.id + ", \n" + chickensType + "\n";
        } else if (type === "json") { // json
            chickenData = "{\"ChickenCoop\": {\"id\": \"" + this.id + "\", \"\n" + chickensType + "\"}}\n";
        }
        return chickenData;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getChickens() {
        return this.chickensCoop;
    }

    setChickens(chickens) {
        this.chickensCoop = chickens;
    }
}
>>>>>>> 8e40484f0077d7fe10786aa1aa0f3cc51debe068
>>>>>>> a064af6ecab12755c8c8b8a5858b342fd47aa80f
