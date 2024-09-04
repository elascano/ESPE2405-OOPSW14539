const readline = require('readline');
const SortingContext = require('../controller/SortingContext');
const SaveToMongo = require('../utils/SaveToMongo');

async function main() {
    const context = new SortingContext();
    const mongoSaver = new SaveToMongo();
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    async function askQuestion() {
        rl.question('Enter numbers separated by commas (e.g., 5,3,8,1) or type "exit" to quit: ', async (input) => {
            if (input.toLowerCase() === 'exit') {
                await mongoSaver.close();
                rl.close();
                return;
            }

            const unsortedArray = input.split(',').map(Number);
            const sortedArray = context.sort([...unsortedArray]);

            await mongoSaver.saveSortOperation(unsortedArray, sortedArray, context.sortingStrategy.constructor.name);

            console.log("Sorted array: ", sortedArray);
            console.log("All sort operations saved to MongoDB:");

            const operations = await mongoSaver.getAllSortOperations();
            console.log(operations);

            askQuestion(); // Pregunta de nuevo
        });
    }

    askQuestion();
}

main();
