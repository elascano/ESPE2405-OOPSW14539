import { A } from './a.js';
import { B } from './B.js';
export class E {
    constructor() {
      this.a = new A();
      this.b = new Array(10).fill(null).map(() => new B());
  }
  
   m2(z) {
    console.log('m2 in E ', z);
    }
  }