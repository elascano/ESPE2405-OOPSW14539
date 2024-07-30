package util;

import java.util.ArrayList;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public interface DataManagement {

    String DATEBASE = "main";
    int ID = 0;

    public void create(String collection, String data);

    public void updata(String collection, String oldData, String newDate);

    public ArrayList<String> read(String collection);

    public void delete(String collection, String searchKey, String searchValue);

}
