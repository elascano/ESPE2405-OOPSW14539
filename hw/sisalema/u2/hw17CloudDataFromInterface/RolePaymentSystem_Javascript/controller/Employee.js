import mongoose from 'mongoose';

const employeeSchema = new mongoose.Schema({
  name: String,
  lastName: String,
  idNumber: String,
  hireDate: Date,
  basicSalary: Number,
  overtimeHours: Number,
  bonuses: Number,
  iessLoans: Number,
  companyLoans: Number,
  absentDays: Number,
  fines: Number,
  bringOwnFood: Boolean
});

export default mongoose.model('Employee', employeeSchema);
