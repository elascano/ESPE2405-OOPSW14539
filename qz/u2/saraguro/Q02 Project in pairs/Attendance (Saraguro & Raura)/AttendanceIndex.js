const readline = require('readline');
const AttendanceRegister = require('./AttendanceRegister');
const Attendance = require('./Attendance');
const Student = require('./Student');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const attendanceRegister = new AttendanceRegister();
attendanceRegister.loadAttendance();

const askQuestion = (question) => {
  return new Promise((resolve) => rl.question(question, resolve));
};

(async () => {
  const action = await askQuestion('Choose an action: 1-Record Attendance, 2-Check Student Status: ');

  if (action === '1') {
    const date = await askQuestion('Enter date (YYYY-MM-DD): ');

    let attendance = new Attendance(date);

    while (true) {
      const id = await askQuestion('Enter student ID (or "done" to finish): ');
      if (id.toLowerCase() === 'done') break;

      const name = await askQuestion('Enter student name: ');
      let student = new Student(id, name);

      attendance.takeAttendance(student);
    }

    if (attendance.students.length > 0) {
      attendanceRegister.addAttendance(attendance);
      attendanceRegister.saveAttendance();
    }
  } else if (action === '2') {
    const checkId = await askQuestion('Enter student ID to check pass/fail status: ');
    const passed = attendanceRegister.studentPass(checkId);
    console.log(`Student with ID ${checkId} ${passed ? 'passed' : 'failed'} the Algebra course.`);
  }

  rl.close();
})();
