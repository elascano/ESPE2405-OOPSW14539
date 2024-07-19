const { expect } = require('@jest/globals');
const { PersonController } = require('../controller/PersonController');
const { differenceInDays, differenceInYears } = require('date-fns');

describe('PersonController', () => {
  test('computeAgeInDays', () => {
    const birthDate = '2000-01-01';
    const expectedDays = differenceInDays(new Date(), new Date(birthDate));
    const result = PersonController.computeAgeInDays(birthDate);
    expect(result).toBe(expectedDays);
  });
  
  test('computeAgeInYears', () => {
    const birthDate = '2000-01-01';
    const expectedYears = differenceInYears(new Date(), new Date(birthDate));
    const result = PersonController.computerAgeInyears(birthDate);
    expect(result).toBe(expectedYears);
  });
});