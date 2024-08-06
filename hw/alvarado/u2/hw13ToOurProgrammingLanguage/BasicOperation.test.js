const BasicOperation = require('./BasicOperation');

test('addTwoNumbers with positive numbers', () => {
    const addend1 = 1.2;
    const addend2 = 2.4;
    const expected = 3.6;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expected, 5);
  });
  
  test('addTwoNumbers with positive and negative numbers', () => {
    const addend1 = 1.8;
    const addend2 = -2.2;
    const expected = -0.4;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expected, 5);
  });
  
  test('addTwoNumbers with negative numbers', () => {
    const addend1 = -1.5;
    const addend2 = -2.5;
    const expected = -4.0;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expected, 5);
  });
  
  test('addTwoNumbers with zero', () => {
    const addend1 = 0;
    const addend2 = 0;
    const expected = 0;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expected, 5);
  });
  
  test('addTwoNumbers with large numbers', () => {
    const addend1 = 1000000;
    const addend2 = 2000000;
    const expected = 3000000;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBe(expected);
  });