
package ec.edu.espe.beveragesystem.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourlnCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }
    
    void boilWater(){
        System.out.println("Boiling water");
    }
    
    abstract void brew();
    
    void pourlnCup(){
        System.out.println("Pourling into cup");
    }
    
    abstract void addCondiments();
    
    abstract boolean wantsCondiments();
}
