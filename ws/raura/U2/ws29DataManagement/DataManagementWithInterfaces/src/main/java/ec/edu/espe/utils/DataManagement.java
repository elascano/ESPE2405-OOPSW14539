/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.utils;

import java.util.ArrayList;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public interface DataManagement {
    String DATABASE = "main";
    int ID = 0;
    
    public void create(String collection, String data);
    public void update(String collection, String oldData, String newData);
    public ArrayList<String> read(String collection);
    public void delete(String collection, String searchKey, String searchValue);
    
}
