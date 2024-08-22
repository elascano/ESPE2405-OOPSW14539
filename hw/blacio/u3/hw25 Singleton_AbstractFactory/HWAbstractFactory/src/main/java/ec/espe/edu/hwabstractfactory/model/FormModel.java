package ec.espe.edu.hwabstractfactory.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class FormModel {

    private Map<String, String> fields = new HashMap<>();

    public void addField(String fieldName, String fieldValue) {
        fields.put(fieldName, fieldValue);
    }

    public Map<String, String> getFields() {
        return fields;
    }
}
