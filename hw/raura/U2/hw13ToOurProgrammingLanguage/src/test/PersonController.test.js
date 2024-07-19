const PersonController = require('../controller/PersonController')

test('computeAgeInDays', () => {
    console.log('computeAgeInDays');
    const birthDate = new Date('2004-04-21');
    const instance = new PersonController();
    const expResult = 7388;
    const result = instance.computeAgeInDays(birthDate);
    expect(result).toBe(expResult);
});

test('computeAgeInYears', () => {
    console.log('computeAgeInYears');
    const birthDate = new Date('2004-04-21');
    const instance = new PersonController();
    const expResult = 20;
    const result = instance.computeAgeInYears(birthDate);
    expect(result).toBe(expResult);
});
