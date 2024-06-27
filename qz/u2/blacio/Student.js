import PersonalData from "./PersonalData.js";

class Student extends PersonalData {
    constructor(id, name, age, course, subjects = []){
        super(name, age);
        this.id = id;
        this.course = course;
        this.subjects = subjects;
        this.proffesorId= null;
    }

    addSubject(subject){
        this.subjects.push(subject);
    }

    listSubjects(){
       console.log(`${this.name} is signed up in the following subjects: ${this.subjects.join(', ')}.`);
    }

    study(){
        console.log(`${this.name} is studying in the course: ${this.course}.`);
    }

    assignProfessor(professorId){
        this.professorId = professorId;
        console.log(`${this.name} is assigned to the professor with the id: ${this.professorId}.`);
    }

}

export default Student;