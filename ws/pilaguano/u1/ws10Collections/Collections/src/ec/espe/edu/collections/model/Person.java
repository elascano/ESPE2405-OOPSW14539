package ec.espe.edu.collections.model;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Sobrescribe toString para una mejor representación de los objetos Person
    @Override
    public String toString() {
        return "Person{id=" + id + ", name=" + name + "}";
    }
}

    
    
    

