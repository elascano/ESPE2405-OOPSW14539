import PersonalData from './PersonalData.js';

class Professor extends PersonalData {
  constructor(id, name, age, subject, students = []) {
    super(name, age);
    this.id = id;
    this.subject = subject;
    this.students = students;
  }

  addStudent(student) {
    if (!this.students.includes(student)) {
      this.students.push(student);
    }
  }

  listStudents() {
    console.log(`The professor ${this.name} teaches ${this.subject} to the following students:`);
    this.students.forEach(stu => {
      console.log(`- ${stu}`);
    });
  }
}

export default Professor;
