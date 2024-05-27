const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function askQuestion(query) {
    return new Promise(resolve => rl.question(query, resolve));
}

async function main() {
    const input = await askQuestion('Enter a number to see its multiplication table: ');
    const number = parseFloat(input);

    if (isNaN(number)) {
        console.log('Please enter a valid number.');
        return rl.close();
    }

    console.log(`Multiplication table of ${number}:`);
    for (let i = 1; i <= 12; i++) {
        console.log(`${number} x ${i} = ${number * i}`);
    }

    rl.close();
}
main();

