/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author WINDOWS
 */
public interface DataManagement {
    String database = "";
    int id = 0;
    public void create(String collection, String Data);
    public void update(String collection, String oldData, String newData);
    public ArrayList<String> read(String collection);
    public void delete(String collecvtion, String searchKey, String searchValue);
}
