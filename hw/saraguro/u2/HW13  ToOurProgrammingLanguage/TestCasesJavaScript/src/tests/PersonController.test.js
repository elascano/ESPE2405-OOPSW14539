import PersonController from '../controllers/PersonController.mjs';
import { differenceInDays, differenceInYears } from 'date-fns';

describe('PersonController Tests', () => {
    let personController;

    beforeEach(() => {
        personController = new PersonController();
    });

    test('computageAgeInDays calculates correct number of days', () => {
        const birthDate = '2004-04-14';
        const expectedDays = differenceInDays(new Date(), new Date(birthDate));
        const result = personController.computageAgeInDays(birthDate);
        expect(result).toBe(expectedDays);
    });

    test('computageAgeInYears calculates correct number of years', () => {
        const birthDate = '2004-04-14';
        const expectedYears = differenceInYears(new Date(), new Date(birthDate));
        const result = personController.computageAgeInYears(birthDate);
        expect(result).toBe(expectedYears);
    });
});
