import BasicOperation from '../controllers/BasicOperation.mjs';

describe('BasicOperation Tests', () => {
    test('addTwoNumbers with floating point numbers', () => {
        const addend1 = 1.2;
        const addend2 = 2.4;
        const expected = 3.6;
        const result = BasicOperation.addTwoNumbers(addend1, addend2);
        expect(result).toBeCloseTo(expected, 5);
    });

    test('addTwoNumbers with a negative number', () => {
        const addend1 = 1.8;
        const addend2 = -2.2;
        const expected = -0.4;
        const result = BasicOperation.addTwoNumbers(addend1, addend2);
        expect(result).toBeCloseTo(expected, 5);
    });

    test('addTwoNumbers with integers', () => {
        const addend1 = 1;
        const addend2 = 2;
        const expected = 3;
        const result = BasicOperation.addTwoNumbers(addend1, addend2);
        expect(result).toBe(expected);
    });
});
