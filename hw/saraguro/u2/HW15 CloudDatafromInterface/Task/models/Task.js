// models/Task.js

const mongoose = require('mongoose');

const TaskSchema = new mongoose.Schema({
    taskName: { type: String, required: true },
    startDate: { type: Date, required: true },
    duration: { type: Number, required: true },
    teacherName: { type: String, required: true },
    shift: { type: String, required: true },
    endDate: { type: Date, required: true },
    subject: { type: String, required: true }
});

module.exports = mongoose.model('Task', TaskSchema);
