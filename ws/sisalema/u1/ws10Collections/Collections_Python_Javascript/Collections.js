import { Person } from "J:/Proyecto/Collections/Collections_Pyth/Person.js";

class Collections {
    static main() {
    const things = [];
    console.log(`size at the beginning: ${things.length}`);

    const person = new Person(0, "Yostin");
    things.push(650);
    things.push("Hello OOP 14539, ");
    things.push(3343.27);
    things.push(person);

    console.log(`things: ${things}`);

    things.splice(things.indexOf(650), 1);
    console.log(`things after removing 650: ${things}`);

    things.splice(things.indexOf(person), 1);
    console.log(`things after removing person: ${things}`);
}
}

Collections.main();