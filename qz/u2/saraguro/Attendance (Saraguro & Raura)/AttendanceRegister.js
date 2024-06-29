const fs = require('fs');
const path = require('path');
const Attendance = require('./Attendance');
const Student = require('./Student');

class AttendanceRegister {
  constructor() {
    this.attCheckIn = [];
  }

  loadAttendance() {
    try {
      const dataPath = path.join(__dirname, 'data', 'attendance.json');
      const data = fs.readFileSync(dataPath, 'utf8');
      const rawAttendances = JSON.parse(data);
      this.attCheckIn = rawAttendances.map(rawAttendance => {
        const attendance = new Attendance(rawAttendance.date);
        rawAttendance.students.forEach(rawStudent => {
          const student = new Student(rawStudent.id, rawStudent.name);
          attendance.addStudent(student);
        });
        return attendance;
      });
    } catch (err) {
      console.log('Error loading attendance data:', err);
    }
  }

  saveAttendance() {
    try {
      const dataPath = path.join(__dirname, 'data', 'attendance.json');
      const data = JSON.stringify(this.attCheckIn, null, 2);
      fs.writeFileSync(dataPath, data, 'utf8');
    } catch (err) {
      console.log('Error saving attendance data:', err);
    }
  }

  addAttendance(att) {
    const existingAttendance = this.attCheckIn.find(a => a.date === att.date);
    if (existingAttendance) {
      att.students.forEach(student => {
        existingAttendance.addStudent(student);
      });
    } else {
      this.attCheckIn.push(att);
    }
    this.saveAttendance();
  }

  getAttendance(date) {
    return this.attCheckIn.filter(att => att.date === date);
  }

  studentPass(id) {
    const totalClasses = 5; // Número total de días de asistencia
    let attendanceCount = 0;

    this.attCheckIn.forEach(att => {
      if (att.students.find(student => student.id === id)) {
        attendanceCount++;
      }
    });

    const absences = totalClasses - attendanceCount;
    return absences < 3; // El estudiante aprueba si tiene menos de 3 faltas
  }
}

module.exports = AttendanceRegister;
