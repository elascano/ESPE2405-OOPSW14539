/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.utils;

import java.util.ArrayList;

/**
 *
 * @author heiso
 */
public interface DataManasment {
    String DATABASE=""
            
    public void create(String collection, String data);
    public void update(String collection, String oldData, String newData);
    public ArrayList<String> read(String collection);
    public void delete(String collection, String searchKey, String searchValue);
}
