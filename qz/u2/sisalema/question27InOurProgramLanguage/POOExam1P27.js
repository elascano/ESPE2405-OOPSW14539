import { A } from './a.js';
import { B } from './B.js';
import { C } from './C.js';
import { E } from './E.js';

class POOExam1P27 {
    static main() {
      let e = new E(); 
      let c = new C();
      e.m2(c);
      let a = new A();
      let b1 = new B();
      let b2 = new B();
      a.m1(b1, b2);
    
    }
  }
  
  POOExam1P27.main();