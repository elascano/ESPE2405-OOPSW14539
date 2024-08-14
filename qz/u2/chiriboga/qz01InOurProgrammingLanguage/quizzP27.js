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

class A {
    constructor() {
        this.b1 = null;
        this.b2 = null;
    }

    /**
     * @param {B} x 
     * @param {B} y 
     */
    m1(x, y) {
        console.log('Method m1 called with objects:', x, y);
    }
}

class B {
}

class C {
    constructor() {
        this.b = null;
    }
}

class E {
    constructor() {
        this.a = null;
        this.b = new Array(10).fill(new B());
    }

    /**
     * @param {C} z 
     */
    m2(z) {
        //Line to test the program
        console.log('Method m2 called with object:', z);
    }
}
//The program runs using node, from the terminal you look for the file folder and place node quizzP27.js
POOExam1P27.main();

