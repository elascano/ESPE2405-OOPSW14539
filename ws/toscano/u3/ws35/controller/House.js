import mongoose from 'mongoose';

const houseSchema = new mongoose.Schema({
  address: String,
  city: String,
  size: Number,
  bedrooms: Number,
  price: Number
});

houseSchema.pre('save', function(next) {
  this.price = this.size * this.bedrooms * 100; // Calculo del precio
  next();
});

export default mongoose.model('House', houseSchema);
