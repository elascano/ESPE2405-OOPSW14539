/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package util;

import java.util.ArrayList;

/**
 *
 * @author leydi
 */
public interface DataManagement {
    String DATEBASE= "main";
    int ID = 0;
    public void create(String collection, String data);
    public void updata(String collection, String oldData,String newDate);
    public ArrayList<String> read (String collection);
    public void delete (String collection, String searchKey,String searchValue);
    
}
