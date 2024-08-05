import { Registration } from './Registration.js';
import * as readline from 'readline';
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
class MainWindows {
    static async main() {
        let registro = false;
        const registration = new Registration(); // Create an instance of Registration class
        do {
            console.log("_______________________________________________");
            console.log("[REGISTRO DE MATRICULAS]");
            console.log("----------------------------------------------");
            console.log("(1) Agregar Matricula.");
            console.log("(2) Eliminar Matricula.");
            console.log("(3) Ver los Estudiantes y Materias que hay en el sistema");
            console.log("(4) Imprimir Registro.");
            console.log("(5) Salir");
            console.log("\nSeleccione una opcion: ");

            let answer = await new Promise(resolve => {
                rl.question("\nSeleccione una opcion: ", (answer) => {
                    resolve(answer);
                });
            });
            const option = parseInt(answer);
            switch (option) {
                case 1:
                    await registration.createRegistration(); 
                    break;
                case 2:
                    await registration.removeSubject(); 
                    break;
                    case 3:
                        console.log("Estudiantes y Materias Registradas:");
                        registration.registrations.forEach((registration) => {
                          console.log(`Estudiante: ${registration.student.name} - ${registration.student.id}`);
                          console.log("Materias:");
                          if (registration.subjects) { // Verificar si registration.subjects existe
                            registration.subjects.forEach((subject) => {
                              console.log(`  - ${subject.name} - ${subject.nrc}`);
                            });
                          } else {
                            console.log("No hay materias registradas para este estudiante.");
                          }
                          console.log();
                        });
                break;
                case 4:
                    registration.generateRegistrationNumber(); 
                    break;
                case 5:
                    console.log("Saliendo del registro...\n");
                    registro = true;
                    break;
                default:
                    console.log("[ERROR]: Ingrese una opcion disponible..\n");
            }
        } while (!registro);

        rl.close(); 
    }
}

MainWindows.main();