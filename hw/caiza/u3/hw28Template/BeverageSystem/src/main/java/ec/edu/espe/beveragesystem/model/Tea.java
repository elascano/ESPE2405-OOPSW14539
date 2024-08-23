package ec.edu.espe.beveragesystem.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Steep the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar");
    }
    
    @Override
    public boolean wantsCondiments(){
        String answer = getUserInput();
        
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }
    
    private String getUserInput(){
        String answer = "Y";
       
        System.out.println("Would you like sugar with your tea (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        return answer;
    }
}
