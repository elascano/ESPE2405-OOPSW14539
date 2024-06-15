
package ec.edu.espe.IncomeTaxCalculator.model;

/**
 *
 * @author Marco Padilla, CodeCrafting Engineers, DCCO-ESPE
 */
public class Person {
    private String name;
    private double annualSalary;

    public Person(String name, double annualSalary) {
        this.name = name;
        this.annualSalary = annualSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", annualSalary=" + annualSalary + '}';
    }
}
