// tests/task.test.js

const request = require('supertest');
const app = require('../index'); // Importa tu aplicación Express (index.js)

describe('POST /task', () => {
  it('should create a new task with valid data', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        taskName: 'Test Task',
        startDate: '2024-07-15',
        duration: 5,
        teacherName: 'Test Teacher',
        shift: 'Morning',
        subject: 'Math'
      });

    expect(res.statusCode).toEqual(302); // Verifica que se redirige correctamente después de guardar
  });

  it('should return 400 if taskName is missing', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        startDate: '2024-07-15',
        duration: 5,
        teacherName: 'Test Teacher',
        shift: 'Morning',
        subject: 'Math'
      });

    expect(res.statusCode).toEqual(400);
    expect(res.body.error).toBe('taskName is required');
  });

  it('should return 400 if startDate is missing', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        taskName: 'Test Task',
        duration: 5,
        teacherName: 'Test Teacher',
        shift: 'Morning',
        subject: 'Math'
      });

    expect(res.statusCode).toEqual(400);
    expect(res.body.error).toBe('startDate is required');
  });

  it('should return 400 if duration is missing', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        taskName: 'Test Task',
        startDate: '2024-07-15',
        teacherName: 'Test Teacher',
        shift: 'Morning',
        subject: 'Math'
      });

    expect(res.statusCode).toEqual(400);
    expect(res.body.error).toBe('duration is required');
  });

  it('should return 400 if teacherName is missing', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        taskName: 'Test Task',
        startDate: '2024-07-15',
        duration: 5,
        shift: 'Morning',
        subject: 'Math'
      });

    expect(res.statusCode).toEqual(400);
    expect(res.body.error).toBe('teacherName is required');
  });

  it('should return 400 if shift is missing', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        taskName: 'Test Task',
        startDate: '2024-07-15',
        duration: 5,
        teacherName: 'Test Teacher',
        subject: 'Math'
      });

    expect(res.statusCode).toEqual(400);
    expect(res.body.error).toBe('shift is required');
  });

  it('should return 400 if subject is missing', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        taskName: 'Test Task',
        startDate: '2024-07-15',
        duration: 5,
        teacherName: 'Test Teacher',
        shift: 'Morning'
      });

    expect(res.statusCode).toEqual(400);
    expect(res.body.error).toBe('subject is required');
  });

  it('should return 400 if duration is not a number', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        taskName: 'Test Task',
        startDate: '2024-07-15',
        duration: 'five',
        teacherName: 'Test Teacher',
        shift: 'Morning',
        subject: 'Math'
      });

    expect(res.statusCode).toEqual(400);
    expect(res.body.error).toBe('duration must be a number');
  });

  it('should return 400 if startDate is not a valid date', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        taskName: 'Test Task',
        startDate: 'not a date',
        duration: 5,
        teacherName: 'Test Teacher',
        shift: 'Morning',
        subject: 'Math'
      });

    expect(res.statusCode).toEqual(400);
    expect(res.body.error).toBe('startDate must be a valid date');
  });

  it('should return 400 if shift is not Morning or Afternoon', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        taskName: 'Test Task',
        startDate: '2024-07-15',
        duration: 5,
        teacherName: 'Test Teacher',
        shift: 'Evening',
        subject: 'Math'
      });

    expect(res.statusCode).toEqual(400);
    expect(res.body.error).toBe('shift must be Morning or Afternoon');
  });

  it('should return 400 if subject is not Math, Science, or History', async () => {
    const res = await request(app)
      .post('/task')
      .send({
        taskName: 'Test Task',
        startDate: '2024-07-15',
        duration: 5,
        teacherName: 'Test Teacher',
        shift: 'Morning',
        subject: 'English'
      });

    expect(res.statusCode).toEqual(400);
    expect(res.body.error).toBe('subject must be Math, Science, or History');
  });
});
