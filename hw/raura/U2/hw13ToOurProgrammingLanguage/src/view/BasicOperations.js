const BasicOperation = require('../controller/BasicOperation');
const PersonController = require('../controller/PersonController');


class BasicOperations {
    static main() {
        console.log("Basic Operations! \nAndrea Raura, OOP 14539");
        console.log("--> Unit Testing in action <--");

        let addend1;
        let addend2;
        let sum;

        addend1 = 1.2;
        addend2 = 2.4;
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        console.log(`The sum of ${addend1} + ${addend2} --> ${sum}`);

        addend1 = 1.3;
        addend2 = 2.5;
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        console.log(`The sum of ${addend1} + ${addend2} --> ${sum}`);

        addend1 = 1.8;
        addend2 = -2.2;
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        console.log(`The sum of ${addend1} + ${addend2} --> ${sum}`);

        const personController = new PersonController();
        const bornOnDate = new Date('2004-04-21');
        const days = personController.computeAgeInDays(bornOnDate);
        console.log(`my days are --> ${days}`);

        const numberOfYears = personController.computeAgeInYears(bornOnDate);
        console.log(`my age in years --> ${numberOfYears}`);
    }
}

BasicOperations.main();
