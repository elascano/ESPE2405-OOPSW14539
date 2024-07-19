//CODIGO DE RICARDO LAINEZ!!
class A {
    constructor() {
        this.b1 = null;
        this.b2 = null;
    }

    m1(x, y) {
        this.b1 = x;
        this.b2 = y;
        console.log('Método m1 en A ejecutado con', x, y);
    }
}

class B {
    constructor() {
        console.log('Instancia de B creada');
    }
}

class C {
    constructor() {
        this.b = new B();
    }
}

class E {
    constructor() {
        this.a = new A();
        this.b = new Array(10).fill(null).map(() => new B());
    }

    
    m2(z) {
        console.log('Método m2 en E ejecutado con', z);
    }
}

function main() {
    const e = new E();
    const c = new C();
    e.m2(c);

    const a = new A();
    const b1 = new B();
    const b2 = new B();
    a.m1(b1, b2);
}

main();
