import { PersonController } from "../controller/PersonController.js";
import {BasicOperation} from "../controller/BasicOperation.js";
class BasicOperations{
static main() {
    console.log("Basic Operations! \n Yostin Sisalema,OOP 14539");
    console.log("-->Unit Testing in action<--");

    let addend1, addend2, sum;

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

    const personController = PersonController;

    const bornOnDate = "1970-12-17";
    const days = personController.computeAgeInDays(bornOnDate);
    console.log(`my days are --> ${days}`);

    const numberOfYears = personController.computerAgeInyears(bornOnDate);
    console.log(`my age in years --> ${numberOfYears}`);
}
}

BasicOperations.main();
/*"jest": {
  "moduleFileExtensions": [
    "js",
    "jsx",
    "ts",
    "tsx",
    "esm"
  ],
  "transform": {
    "^.+\\.(js|jsx|ts|tsx)$": "babel-jest"
  },
  "moduleDirectories": ["node_modules", "<rootDir>/controller"]
  } */