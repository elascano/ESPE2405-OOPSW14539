    import { Student } from "./Student.js";
    import * as readline from 'readline';
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });
    export class Subject {
        static students = [];
        constructor(nrc, nameSubject, credits, capacity, enrolled) {
            this.nrc = nrc;
            this.nameSubject = nameSubject;
            this.credits = credits;
            this.capacity = capacity;
            this.enrolled = enrolled;
            this.students = [];
        }

        getNrc() {
            return this.nrc;
        }

        setNrc(newNrc) {
            this.nrc = newNrc;
        }

        getNameSubject() {
            return this.nameSubject;
        }

        setNameSubject(newNameSubject) {
            this.nameSubject = newNameSubject;
        }

        getCredits() {
            return this.credits;
        }

        setCredits(newCredits) {
            this.credits = newCredits;
        }

        getCapacity() {
            return this.capacity;
        }

        setCapacity(newCapacity) {
            this.capacity = newCapacity;
        }

        getEnrolled() {
            return this.enrolled;
        }

        setEnrolled(newEnrolled) {
            this.enrolled = newEnrolled;
        }
        addStudent(student) {
            if (this.isAvailable()) {
                this.students.push(student);
                this.enrolled++;
                return true;
            }
            return false;
        }
        static createStudent() {
            return new Promise((resolve, reject) => {
                rl.question("> Ingrese el id del Estudiante: ", (id) => {
                    rl.question("> Nombre del estudiante: ", (name) => {
                        rl.question("> Apellido del estudiante: ", (lastName) => {
                            rl.question("> Correo Electronico: ", (email) => {
                                rl.question("> Cuantos años tiene: ", (age) => {
                                    const student = new Student(id, name, lastName, email, parseInt(age));
                                    resolve(student);
                                });
                            });
                        });
                    });
                });
            });
        }
    
        getEnrolledStudents() {
            return this.students;
        }

        isAvailable() {
            return this.enrolled < this.capacity;
        }

        async checkPrerequisites() {
            let hasDiploma, hasCertificate, hasPaid;
            await new Promise((resolve, reject) => {
                rl.question("> Posee un diploma o certificado de la primaria: (true/false)", (answer) => {
                    hasDiploma = answer.toLowerCase() === 'true';
                    rl.question("> Posee la documentación del estudiante: (true/false)", (answer) => {
                        hasCertificate = answer.toLowerCase() === 'true';
                        rl.question("> Si ha realizado el pago: (true/false)", (answer) => {
                            hasPaid = answer.toLowerCase() === 'true';
                            resolve();
                        });
                    });
                });
            });
            this.hasPrerequisites = hasDiploma && hasCertificate && hasPaid;
            return this.hasPrerequisites;
        }
    }
 /*
    static addStudent(student, rl, registration) {
        if (student.maticulas.length >= MAX_MATRICULAS) {
            console.log("El registro esta lleno..\nComuniquese con el Administrador del sistema.");
            return;
        }

        let subjects = [];

        rl.question("> Ingrese el id del Estudiante: ", (idInput) => {
            const id = idInput;
            for (let i = 0; i < student.maticulas.length; i++) {
                if (student.maticulas[i].student.getId() === id) {
                    console.log("El usuario ya ha sido registrado previamente en el sistema..");
                    return;
                }
            }

            rl.question("> Nombre del estudiante: ", (name) => {
                rl.question("> Apellido del estudiante: ", (lastName) => {
                    rl.question("> Correo Electronico: ", (email) => {
                        rl.question("> Cuanto años tiene : ", (age) => {
                            const student = new Student(id, name, lastName, email, age);

                            rl.question("> Ingrese cuantas materias tiene el estudiantes: ", (numberSubject) => {
                                const numSubjects = parseInt(numberSubject);
                                Registration.addSubject(numSubjects, (subjects) => { // Call addSubject on the registration instance
                                    const registrationData = [{ student, subjects }];
                                    const fileName = `registro_${student.registrationNumber}.json`;
                                    SaveManager.saveToJSON(registrationData, fileName);
                                    console.log("Matricula agregada con éxito.");

                                    student.maticulas.push({ student, subjects });
                                    student.registrationNumber++;
                                });
                            });
                        });
                    });
                });
            });
        });
    }*/

