const BasicOperation = require('../controller/BasicOperation')

test('addTwoNumbers', () => {
    console.log('addTwoNumbers');
    const addend1 = 1.2;
    const addend2 = 2.4;
    const expResult = 3.6;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expResult, 5);
});

test('addTwoNumbers with a negative number', () => {
    console.log('addTwoNumbers');
    const addend1 = 1.8;
    const addend2 = -2.2;
    const expResult = -0.4;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expResult, 5);
});

test('addTwoNumbers with integers', () => {
    console.log('addTwoNumbers');
    const addend1 = 1;
    const addend2 = 2;
    const expResult = 3;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expResult, 5);
});
