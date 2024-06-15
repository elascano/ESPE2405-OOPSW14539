package utils;

import ec.edu.espe.saveanobject.model.Computer;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */

public class SerializeUtil {
    private static class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        @Override
        protected void writeStreamHeader() throws IOException {
            reset();
        }
    }

    public static void create(Scanner scanner) {
        System.out.print("Enter file name to save the object: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter computer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter computer model: ");
        String model = scanner.nextLine();

        System.out.print("Enter computer brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter computer storage: ");
        int storage = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter computer RAM: ");
        int RAM = scanner.nextInt();
        scanner.nextLine();

        Computer computer = new Computer(id, model, brand, storage, RAM);

        try (FileOutputStream fileOut = new FileOutputStream(fileName, true);
             ObjectOutputStream out = fileOut.getChannel().size() == 0 ?
                     new ObjectOutputStream(fileOut) :
                     new AppendableObjectOutputStream(fileOut)) {
            out.writeObject(computer);
            System.out.println("Object serialized and saved in " + fileName);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void read(Scanner scanner) {
        System.out.print("Enter file name to read the objects: ");
        String fileName = scanner.nextLine();

        List<Computer> computers = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream(fileName); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            while (true) {
                try {
                    Computer computer = (Computer) in.readObject();
                    computers.add(computer);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Computer class not found");
            c.printStackTrace();
        }

        for (Computer computer : computers) {
            System.out.println("Deserialized object: " + computer);
        }
    }
}
