
package ec.edu.espe.saveanobject.view;

import ec.edu.espe.saveanobject.model.Computer;
import utils.SerializeUtil;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class ComputerSave {
    public static void main(String[] args) {
        Computer computer = new Computer (2,"XPS 15", "DELL", 32, 16 );
        SerializeUtil.create("computer.ser", computer);
        Computer deserializedComputer = SerializeUtil.read("computer.ser");
        
        System.out.println("Objeto deserializado: " + deserializedComputer);
        
    }
    
}
