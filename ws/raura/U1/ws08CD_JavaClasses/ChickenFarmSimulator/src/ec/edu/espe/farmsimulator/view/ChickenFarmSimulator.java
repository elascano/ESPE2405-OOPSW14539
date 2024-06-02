package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad,DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args){
        
    System.out.println("Andrea's Chicken Farm Simulator");
    Chicken chicken1 = new Chicken(1, "Anita", "brown", 2, true, new Date());
    System.out.println("Chicken 1-->" + chicken1);
    
    int id=2;
    String name="Fanny";
    String color="white";
    int age=1;
    boolean molting=true;
    Date bornOnDate=new Date();
    
    Chicken chicken2=new Chicken(id,name,color,age,molting,bornOnDate);
    System.out.println("Chicken 2-->" + chicken2);
    }
}

  
    



    
