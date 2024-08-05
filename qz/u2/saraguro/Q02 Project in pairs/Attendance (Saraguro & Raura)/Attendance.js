class Attendance {
  constructor(date) {
    this.date = date;
    this.students = [];
  }

  takeAttendance(student) {
    if (!this.students.find(s => s.id === student.id)) {
      this.students.push(student);
      return true;
    }
    return false;
  }

  addStudent(student) {
    if (!this.students.find(s => s.id === student.id)) {
      this.students.push(student);
    }
  }
}

module.exports = Attendance;
