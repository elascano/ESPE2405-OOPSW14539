package util;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public interface FileManager extends DataManagement {

    public void openFile(String fileName);

    public void closeFile(String fileName);
}
