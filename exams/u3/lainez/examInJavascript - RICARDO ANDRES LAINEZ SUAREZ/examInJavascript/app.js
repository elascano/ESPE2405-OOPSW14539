const { MongoClient } = require('mongodb');

const uri = "mongodb+srv://ricardoandreslainezsuarez:ricardo_1422@ricardolainez.yyg9cp1.mongodb.net/";

class SortingStrategy {
    sort(arr) {
        throw new Error("Este método debe ser implementado");
    }
}

class BubbleSort extends SortingStrategy {
    sort(arr) {
        let n = arr.length;
        for (let i = 0; i < n - 1; i++) {
            for (let j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                }
            }
        }
        return arr;
    }
}

class QuickSort extends SortingStrategy {
    sort(arr) {
        if (arr.length <= 1) return arr;
        let pivot = arr[Math.floor(arr.length / 2)];
        let left = arr.filter(x => x < pivot);
        let middle = arr.filter(x => x === pivot);
        let right = arr.filter(x => x > pivot);
        return [...this.sort(left), ...middle, ...this.sort(right)];
    }
}

class InsertionSort extends SortingStrategy {
    sort(arr) {
        for (let i = 1; i < arr.length; i++) {
            let key = arr[i];
            let j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

class SortingContext {
    setSortStrategy(strategy) {
        this.strategy = strategy;
    }

    sort(arr) {
        return this.strategy.sort(arr);
    }

    selectStrategy(arr) {
        const size = arr.length;
        if (size >= 2 && size <= 5) {
            this.setSortStrategy(new BubbleSort());
            return "BubbleSort";
        } else if (size >= 6 && size <= 10) {
            this.setSortStrategy(new InsertionSort());
            return "InsertionSort";
        } else if (size > 10) {
            this.setSortStrategy(new QuickSort());
            return "QuickSort";
        } else {
            throw new Error("El tamaño del array debe ser mayor a 1");
        }
    }
}

async function main() {
    const input = "5,8,7,2"; 

    let arr = input.split(",").map(Number);

    const context = new SortingContext();

    const algorithm = context.selectStrategy(arr);

    const sortedArray = context.sort(arr);

    console.log("Array original:", arr);
    console.log("Algoritmo usado:", algorithm);
    console.log("Array ordenado:", sortedArray);

    const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

    try {
        await client.connect();
        const database = client.db("strategylainez"); 
        const collection = database.collection("arrayricardo"); 

        const doc = {
            unsorted: input,
            size: arr.length,
            "sort algorithm": algorithm,
            sorted: sortedArray.join(",")
        };
        const result = await collection.insertOne(doc);
        console.log(`Documento insertado con el ID: ${result.insertedId}`);
    } catch (error) {
        console.error("Error al conectarse a MongoDB:", error);
    } finally {
        await client.close();
    }
}

main().catch(console.error);
