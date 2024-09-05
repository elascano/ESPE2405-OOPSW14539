
package ec.edu.espe.templateandcompsite;

/**
 *
 * @author Sjean
 */
public class File extends FileSystemItem {

    private double size;

    public File(String name, double size) {
        super(name);
        this.size = size;
    }

    @Override
    protected void showAdditionalDetails() {
        System.out.println("File Size: " + size + " MB");
    }

    @Override
    public void add(FileSystemItem item) {
        // Files cannot contain other items
        throw new UnsupportedOperationException("Cannot add items to a file.");
    }

    @Override
    public void remove(FileSystemItem item) {
        // Files do not contain other items
        throw new UnsupportedOperationException("Cannot remove items from a file.");
    }

    @Override
    public FileSystemItem getChild(int i) {
        // Files do not contain other items
        throw new UnsupportedOperationException("Files do not contain other items.");
    }
}
