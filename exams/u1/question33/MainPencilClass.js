module.exports = Pencil;
module.exports = SavePencil;
module.exports = ReadPencil;

// Create a Pencil instance
const myPencil = new Pencil("Dixon", "Yellow", 7.5);

// Save the Pencil instance to JSON
const savedPencilJson = SavePencil.save(myPencil);
console.log("Saved JSON:", savedPencilJson);

// Read the Pencil instance from JSON
const loadedPencil = ReadPencil.read(savedPencilJson);
console.log("Loaded Pencil:", loadedPencil);

// Accessing the properties using getters
console.log("Brand:", loadedPencil.brand);
console.log("Color:", loadedPencil.color);
console.log("Length:", loadedPencil.length);

// Updating the properties using setters
loadedPencil.brand = "Faber-Castell";
loadedPencil.color = "Green";
loadedPencil.length = 6.5;
console.log("Updated Pencil:", loadedPencil);