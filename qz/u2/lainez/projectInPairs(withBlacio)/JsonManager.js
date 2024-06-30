import fs from 'fs';

class JsonManager {
  static saveToFile(filename, data) {
    fs.writeFileSync(filename, JSON.stringify(data, null, 2), 'utf-8');
  }

  static readFromFile(filename) {
    const data = fs.readFileSync(filename, 'utf-8');
    return JSON.parse(data);
  }
}

export default JsonManager;
