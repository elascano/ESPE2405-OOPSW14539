export class Student{
    constructor(id,name,lastName, email, age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
    getId(){
        this.id = id;
    }
    setId(newId) {
        this.id = newId;
    }
    getName() {
        return this.name;
    }
    setName(newName) {
        this.name = newName;
    }
    getLastName() {
        return this.name;
    }
    setLastName(newLastName) {
        this.lastName = newLastName;
    }
}