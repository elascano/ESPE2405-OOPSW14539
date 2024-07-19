// Definimos la clase A
class A {
    constructor() {
        this.b1 = null;
        this.b2 = null;
    }

    /**
     * Este método usa dos objetos de tipo B
     * @param {B} x - objeto de tipo B
     * @param {B} y - objeto de tipo B
     */
    m1(x, y) {
        this.b1 = x;
        this.b2 = y;
        console.log('Método m1 en A ejecutado con', x, y);
    }
}

// Definimos la clase B
class B {
    constructor() {
        console.log('Instancia de B creada');
    }
}

// Definimos la clase C
class C {
    constructor() {
        this.b = new B();
    }
}

// Definimos la clase E
class E {
    constructor() {
        this.a = new A();
        this.b = new Array(10).fill(null).map(() => new B());
    }

    /**
     * Este método permite usar un objeto de tipo C y no devuelve nada
     * @param {C} z - este es un objeto de tipo C
     */
    m2(z) {
        console.log('Método m2 en E ejecutado con', z);
    }
}

// Función principal para ejecutar el programa
function main() {
    const e = new E();
    const c = new C();
    e.m2(c);

    // Código opcional
    const a = new A();
    const b1 = new B();
    const b2 = new B();
    a.m1(b1, b2);
}

// Llamada a la función principal
main();
