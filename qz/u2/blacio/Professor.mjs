import Person from "./PersonalData.js";

class Professor extends Person{
    constructor(name, age, subject, students = []){
        super(name, age);
        this.subject = subject;
        this.students = students;
    }

    addsStudent(student){
        this.students.push(student);
    }

    listStudents(){
        console.log(`The professor ${this.name} teachs $(this.subject) to the following students: `);
        this.students.forEach(stu => {
            console.log(`- ${stu}`);
        });
    }
}

export default Professor;