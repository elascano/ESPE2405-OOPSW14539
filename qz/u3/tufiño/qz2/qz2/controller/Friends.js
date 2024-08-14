import mongoose from 'mongoose';

const friendSchema = new mongoose.Schema({
  name: String,
  lastName: String,
  email: String,
  phone: String,
  birthDate: Date,
  age: Number // Añadir el campo `age`
}, {
  toJSON: {
    virtuals: true,
    transform: function(doc, ret) {
      delete ret.__v;
      return ret;
    }
  },
  toObject: { virtuals: true }
});

friendSchema.virtual('calculatedAge').get(function() {
  if (!this.birthDate) return null;
  
  const today = new Date();
  let age = today.getFullYear() - this.birthDate.getFullYear();
  const monthDiff = today.getMonth() - this.birthDate.getMonth();
  
  if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < this.birthDate.getDate())) {
    age--;
  }
  
  return age;
});

export default mongoose.model('Friend', friendSchema);
