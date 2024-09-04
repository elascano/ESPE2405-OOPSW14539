package ec.edu.espe.templateandcompsite;

/**
 *
 * @author Sjean
 */
public class Main {

    public static void main(String[] args) {
        // Create files
        File file1 = new File("File1.txt", 10);
        File file2 = new File("File2.txt", 20);

        // Create folders
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        // Build the composite structure
        folder1.add(file1);
        folder1.add(file2);
        folder2.add(folder1);

        // Display details using the template method
        folder2.showDetails();
    }
}
