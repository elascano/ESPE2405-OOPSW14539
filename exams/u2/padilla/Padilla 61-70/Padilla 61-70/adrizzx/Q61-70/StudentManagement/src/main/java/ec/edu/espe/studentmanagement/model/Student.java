
package ec.edu.espe.studentmanagement.model;

/**
 *
 * @author Adrian Padilla
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private int grade;

    public Student(String id, String name, int age, int grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double computeGradeRatio() {
        return (double) grade / age; // Ejemplo de una regla de negocio
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", grade=" + grade + '}';
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}