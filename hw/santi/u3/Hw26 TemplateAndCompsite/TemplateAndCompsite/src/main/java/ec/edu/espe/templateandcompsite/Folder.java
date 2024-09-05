
package ec.edu.espe.templateandcompsite;

/**
 *
 * @author Sjean
 */
import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemItem {

    private List<FileSystemItem> items = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    protected void showAdditionalDetails() {
        System.out.println("Folder contains " + items.size() + " items.");
        for (FileSystemItem item : items) {
            item.showDetails();
        }
    }

    @Override
    public void add(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void remove(FileSystemItem item) {
        items.remove(item);
    }

    @Override
    public FileSystemItem getChild(int i) {
        return items.get(i);
    }
}

