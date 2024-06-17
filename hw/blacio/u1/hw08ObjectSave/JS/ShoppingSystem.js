const Computer = require('./Computer');

const computer = new Computer(0, 'hp', 1000);
console.log('The price of the computer is --> ' + computer.getPvp());
console.log('--> ' + computer.toString());
