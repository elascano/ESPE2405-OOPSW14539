<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a064af6ecab12755c8c8b8a5858b342fd47aa80f
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.VinylRecord.view;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.VinylRecord.model.VinylRecord;
import ec.edu.espe.VinylRecord.util.VinylRecordManager;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class VinylRecordSystem {
    public static void main(String[] args) {
        VinylRecordManager manager = new VinylRecordManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the vinyl record:");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter the title of the vinyl record:");
        String title = scanner.nextLine();

        System.out.println("Enter the artist of the vinyl record:");
        String artist = scanner.nextLine();

        System.out.println("Enter the year of the vinyl record:");
        int year = scanner.nextInt();

        VinylRecord record = new VinylRecord(id, title, artist, year);
        manager.addRecord(record);

        System.out.println("Current Vinyl Records:");
        for (VinylRecord r : manager.getRecords()) {
            System.out.println(r);
        }

        scanner.close();  
    }

    }


<<<<<<< HEAD
=======
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.VinylRecord.view;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.VinylRecord.model.VinylRecord;
import ec.edu.espe.VinylRecord.util.VinylRecordManager;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class VinylRecordSystem {
    public static void main(String[] args) {
        VinylRecordManager manager = new VinylRecordManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the vinyl record:");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter the title of the vinyl record:");
        String title = scanner.nextLine();

        System.out.println("Enter the artist of the vinyl record:");
        String artist = scanner.nextLine();

        System.out.println("Enter the year of the vinyl record:");
        int year = scanner.nextInt();

        VinylRecord record = new VinylRecord(id, title, artist, year);
        manager.addRecord(record);

        System.out.println("Current Vinyl Records:");
        for (VinylRecord r : manager.getRecords()) {
            System.out.println(r);
        }

        scanner.close();  
    }

    }


>>>>>>> 8e40484f0077d7fe10786aa1aa0f3cc51debe068
>>>>>>> a064af6ecab12755c8c8b8a5858b342fd47aa80f
