package ec.edu.espe.clientgui.view;

import ec.edu.espe.clientgui.model.InterfaceCreator;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class Client {

    public static void main(String[] args) {
        InterfaceCreator windowsInterface = InterfaceCreator.getInstance("Windows");
        windowsInterface.createButton();
        windowsInterface.createInterface();
        
        //It's trying to create a new instance but as the class InterfaceCreator have a unique instance it will only throw "Windows"
        InterfaceCreator macOSInterface = InterfaceCreator.getInstance("MacOS");
        macOSInterface.createButton();
        macOSInterface.createInterface();
        
    }
}