export class A {
    constructor() {
        this.b1 = null;
        this.b2 = null;
    }
    m1(x, y) {
        this.b1 = x;
        this.b2 = y;
        console.log('m1 in A executed with', x, y);
    }
  }