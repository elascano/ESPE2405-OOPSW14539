/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.datamanagenmentwithinterfaces.controller.utils;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public interface FileManager extends DataManagement{
    
    public void openFile(String fileName);
    public void closeFile(String fileName);
    
}
