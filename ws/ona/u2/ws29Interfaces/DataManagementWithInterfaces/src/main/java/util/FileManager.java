/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package util;

/**
 *
 * @author leydi
 */
public interface FileManager extends DataManagement{
    public void openFile(String fileName);
    public void closeFile(String fileName);
}
