class Chicken {
    constructor (id, name, color, molting, bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.molting = molting;
        this.bornOnDate = new Date(bornOnDate);
    }

getId(){
    return this.id;
}

setId(id){
    this.id = id;
}
getName(){
    return this.name;
}
setName(name){
    this.name = name;
}

getColor(){
    return this.color;
}
setColor(color){
    this.name = color;
}

getMolting(){
    return this.molting;
}
setMolting(molting){
    this.name = molting;
}

getBornOnDate(){
    return this.bornOnDate;
}

setBornOnDate(bornOnDate){
    this.bornOnDate = new Date(bornOnDate);
}

}