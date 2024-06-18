/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class FileManager {
    public static void save( String data, String fileName,String type ) throws IOException {
        try (FileWriter writer = new FileWriter(fileName + "." +  type, true) ){
            writer.write(data + "\n");
        }
    }   
}
