import readline from 'readline';
import Student from './Student.js';
import Professor from './Professor.mjs'; 
import JSONManager from './JsonManager.js';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const students = [];
const professors = [];

const askQuestion = (question) => {
  return new Promise((resolve) => {
    rl.question(question, (answer) => {
      resolve(answer);
    });
  });
};

const main = async () => {
  while (true) {
    const type = await askQuestion('Enter type of person (1: Student, 2: Professor, 3: Assign Professor to Student, 0: Exit): ');

    if (type === '0') break;

    if (type === '3') {
      const studentId = parseInt(await askQuestion('Student ID: '));
      const professorId = parseInt(await askQuestion('Professor ID: '));

      const student = students.find(s => s.id === studentId);
      if (student) {
        student.assignProfessor(professorId);
      } else {
        console.log('Student not found.');
      }
      continue;
    }

    const id = parseInt(await askQuestion('ID: '));
    const name = await askQuestion('Name: ');
    const age = await askQuestion('Age: ');

    if (type === '1') {
      const course = await askQuestion('Course: ');
      const subject = await askQuestion('Subject: ');
      const student = new Student(id, name, parseInt(age), course, [subject]);
      students.push(student);
    } else if (type === '2') {
      const subject = await askQuestion('Subject: ');
      const studentsInput = await askQuestion('Students (comma-separated): ');
      const studentsList = studentsInput.split(',').map(student => student.trim());
      const professor = new Professor(name, parseInt(age), subject, studentsList);
      professors.push(professor);
    }
  }

  rl.close();

  JSONManager.saveToFile('people.json', { students, professors });

  const dataRead = JSONManager.readFromFile('people.json');
  console.log(dataRead);
};

main();
