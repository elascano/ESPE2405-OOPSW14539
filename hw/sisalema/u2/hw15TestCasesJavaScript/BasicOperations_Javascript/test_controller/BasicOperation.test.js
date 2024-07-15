const { expect } = require('@jest/globals');
const { BasicOperation } = require('../controller/BasicOperation');

describe('BasicOperation', () => {
  test('addTwoNumbers', () => {
    const addend1 = 1.2;
    const addend2 = 2.4;
    const expected = 3.6;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expected, 5);
  });

  test('addTwoNumbersOneNegative', () => {
    const addend1 = 1.8;
    const addend2 = -2.2;
    const expected = -0.4;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBeCloseTo(expected, 5);
  });

  test('addTwoNumbersIntegers', () => {
    const addend1 = 1;
    const addend2 = 2;
    const expected = 3;
    const result = BasicOperation.addTwoNumbers(addend1, addend2);
    expect(result).toBe(expected);
  });
});
/*const PersonController = require('../controllers/PersonController');
const { differenceInDays, differenceInYears } = require('date-fns');

describe('PersonController', () => {
  let personController;

  beforeEach(() => {
    personController = new PersonController();
  });

  test('computeAgeInDays', () => {
    const birthDate = '2000-01-01';
    const expectedDays = differenceInDays(new Date(), new Date(birthDate));
    const result = personController.computeAgeInDays(birthDate);
    expect(result).toBe(expectedDays);
  });

  test('computeAgeInYears', () => {
    const birthDate = '2000-01-01';
    const expectedYears = differenceInYears(new Date(), new Date(birthDate));
    const result = personController.computeAgeInYears(birthDate);
    expect(result).toBe(expectedYears);
  });
}); */