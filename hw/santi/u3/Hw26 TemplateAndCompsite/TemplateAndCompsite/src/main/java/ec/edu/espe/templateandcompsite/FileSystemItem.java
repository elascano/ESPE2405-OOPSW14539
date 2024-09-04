
package ec.edu.espe.templateandcompsite;

/**
 *
 * @author Sjean
 */
public abstract class FileSystemItem {

    protected String name;

    public FileSystemItem(String name) {
        this.name = name;
    }

    // Template method
    public final void showDetails() {
        System.out.println("Item Name: " + name);
        showAdditionalDetails();
    }

    // Primitive operation to be implemented by subclasses
    protected abstract void showAdditionalDetails();

    public abstract void add(FileSystemItem item);
    public abstract void remove(FileSystemItem item);
    public abstract FileSystemItem getChild(int i);
}
