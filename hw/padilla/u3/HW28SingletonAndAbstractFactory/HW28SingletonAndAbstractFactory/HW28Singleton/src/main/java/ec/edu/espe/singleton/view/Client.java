/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.model.InterfaceCreator;


public class Client {

    public static void main(String[] args) {
        InterfaceCreator windowsInterface = InterfaceCreator.getInstance("Windows");
        windowsInterface.createButton();
        windowsInterface.createInterface();
        
        
        InterfaceCreator macOSInterface = InterfaceCreator.getInstance("MacOS");
        macOSInterface.createButton();
        macOSInterface.createInterface();
        
    }
}
