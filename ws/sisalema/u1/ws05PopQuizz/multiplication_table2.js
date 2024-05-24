function multiplication_Table() {
    let num = 1;
    while (num <= 12) {
        console.log(`Tabla de multiplicar del ${num}:`);
        let i = 1;
        while (i <= 12) {
            const result = num * i;
            console.log(`${num} x ${i} = ${result}`);
            i++;
        }
        console.log();
        num++;
    }
}
multiplication_Table();
console.log(`End the program`);