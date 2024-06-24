class SavePencil {
    static save(pencil, filename) {
        if (!(pencil instanceof Pencil)) {
            throw new Error("The object to save is not a Pencil instance.");
        }
        const json = JSON.stringify(pencil);
        fs.writeFileSync(filename, json); 
        console.log(`Pencil saved to ${filename}`);
    }
}