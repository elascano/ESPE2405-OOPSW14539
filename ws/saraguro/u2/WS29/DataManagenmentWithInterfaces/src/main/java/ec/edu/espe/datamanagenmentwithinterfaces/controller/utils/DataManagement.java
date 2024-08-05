/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.datamanagenmentwithinterfaces.controller.utils;

import java.util.ArrayList;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public interface DataManagement {
    
    String DATABASE = "main"; //mayuscula para que se note que es una connstante
    int ID =0;
    
    public void create(String collection, String data);
    public void update(String collection, String olddata, String newData);
    public ArrayList<String> read (String collection);
    public void delete(String collection, String searchKey, String searchValue);
}
