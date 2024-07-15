export class BasicOperation {
    static addTwoNumbers(addend1, addend2) {
        let sum = addend1 + addend2;
        // Si quieres redondear a dos decimales:
        sum = Math.round((addend1 + addend2) * 100) / 100;
        return sum;
    }
}
