<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a064af6ecab12755c8c8b8a5858b342fd47aa80f
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.VinylRecord.util;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.VinylRecord.model.VinylRecord;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class VinylRecordManager {
      private static final String FILE_PATH = "vinyl_records.json";
    private List<VinylRecord> records;
    private Gson gson;

    public VinylRecordManager() {
        records = new ArrayList<>();
        gson = new Gson();
        loadRecords();
    }

    public void addRecord(VinylRecord record) {
        records.add(record);
        saveRecords();
    }

    public List<VinylRecord> getRecords() {
        return records;
    }

    private void saveRecords() {
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(records, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadRecords() {
        try (Reader reader = new FileReader(FILE_PATH)) {
            Type recordListType = new TypeToken<ArrayList<VinylRecord>>(){}.getType();
            records = gson.fromJson(reader, recordListType);
            if (records == null) {
                records = new ArrayList<>();
            }
        } catch (FileNotFoundException e) {
            records = new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
<<<<<<< HEAD
=======
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.VinylRecord.util;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.VinylRecord.model.VinylRecord;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class VinylRecordManager {
      private static final String FILE_PATH = "vinyl_records.json";
    private List<VinylRecord> records;
    private Gson gson;

    public VinylRecordManager() {
        records = new ArrayList<>();
        gson = new Gson();
        loadRecords();
    }

    public void addRecord(VinylRecord record) {
        records.add(record);
        saveRecords();
    }

    public List<VinylRecord> getRecords() {
        return records;
    }

    private void saveRecords() {
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(records, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadRecords() {
        try (Reader reader = new FileReader(FILE_PATH)) {
            Type recordListType = new TypeToken<ArrayList<VinylRecord>>(){}.getType();
            records = gson.fromJson(reader, recordListType);
            if (records == null) {
                records = new ArrayList<>();
            }
        } catch (FileNotFoundException e) {
            records = new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
>>>>>>> 8e40484f0077d7fe10786aa1aa0f3cc51debe068
>>>>>>> a064af6ecab12755c8c8b8a5858b342fd47aa80f
