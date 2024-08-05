import { Subject } from "./Subject.js";
import { SaveManager } from './SaveManager.js';
import * as readline from 'readline';
import { Student } from "./Student.js";
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
export class Registration {
    constructor() {
        this.student = new Student();
        this.subjects = [];
        this.registrationNumber = '';
        this.registration=[];
    }
    get registrations() {
      return this.registration;
    }
    addSubject(subject) {
        this.subjects.push(subject);
    }
    async createRegistration() {
        let registrationPerson = [];
        this.student = await Subject.createStudent();
        const subject = new Subject(); 
        await subject.checkPrerequisites()
        let numSubjects;
        await new Promise((resolve, reject) => {
          rl.question("> Ingrese cuantas materias tiene el estudiante: ", (numSubjectsInput) => {
            numSubjects = parseInt(numSubjectsInput);
            resolve();
          });
        });
        const subjects = [];
        for (let i = 0; i < numSubjects; i++) {
          const subject = await this.createSubject();
          if (this.checkEligibility(subject, this.student)) {
            this.addSubject(subject);
            subject.addStudent(this.student);
            subjects.push({ name: subject.getNameSubject(), nrc: subject.getNrc() });
          }
        }
        registrationPerson.push({student: this.student,subjects: subjects.map(subject => JSON.stringify(subject))});
        this.registration.push({student: this.student, subjects: subjects});
        SaveManager.saveToJSON(registrationPerson,"students");
        console.log("Matricula agregada con éxito.");
      }

    async createSubject() {
        let nrc, nameSubject, credits, capacity, enrolled;
        await new Promise((resolve, reject) => {
            rl.question("> Numero del curso: ", (nrcInput) => {
                nrc = nrcInput;
                rl.question("> Nombre de la Materia: ", (nameSubjectInput) => {
                    nameSubject = nameSubjectInput;
                    rl.question("> Creditos de la Materia: ", (creditsInput) => {
                        credits = parseInt(creditsInput);
                        rl.question("> Cuanta es la capacidad de alumnos: ", (capacityInput) => {
                            capacity = parseInt(capacityInput);
                            rl.question("> Cuantos matriculados hay: ", (enrolledInput) => {
                                enrolled = parseInt(enrolledInput);
                                resolve();
                            });
                        });
                    });
                });
            });
        });
        return new Subject(nrc, nameSubject, credits, capacity, enrolled);
    }
    
    async removeSubject() {
      if (this.registration.length === 0) {
        console.log("No hay registros en el sistema..");
        return;
      }
    
      let id;
      await new Promise((resolve, reject) => {
        rl.question("Ingrese el id del estudiante a eliminar: ", (idInput) => {
          id = idInput;
          resolve();
        });
      });
    
      const index = this.registration.findIndex(r => r.student.id === id);
      if (index !== -1) {
        this.registration.splice(index, 1);
        console.log("Se ha Eliminado la Matricula");
        SaveManager.saveToJSON(this.registration, 'registration');
      } else {
        console.log("Estudiante no encontrado..");
      }
    }
    generateRegistrationNumber() {
        this.registrationNumber = `REG-${Date.now()}`;
        const registrationData = { registrationNumber: this.registrationNumber, student: this.student, subjects: this.subjects };
        const filename = `registration-${this.registrationNumber}.json`;
        SaveManager.saveToJSON(registrationData, filename);
        console.log("Registro de estudiante agregado con éxito.");
    }
    async checkEligibility(subject, student) {
        const maxCredits = 40;
        if (!student.hasPrerequisites) return false;
        if (subject.credits > maxCredits) return false;
        return true;
    }
}

    /*
    static async addSubject(numSubjects, callback) {
        let subjects = [];
        for (let i = 0; i < numSubjects; i++) {
            this.rl.question("> Numero del curso 1: ", (nrc) => {
                this.rl.question("> Nombre de la Materia 1: ", (nameSubject) => {
                    this.rl.question("> Creditos de la Materia 1: ", (credits) => {
                        this.rl.question("> Cuanta es la capacidad de alumnos 1: ", (capacity) => {
                            this.rl.question("> Cauntos matriculados hay 1: ", (enrolled) => {
                                const subject = new Subject(nrc, nameSubject, credits, capacity, enrolled);
                                subjects.push(subject);
                                if (subjects.length === numSubjects) {
                                    callback(subjects);
                                }
                            });
                        });
                    });
                });
            });
        }
    }*/