package ec.espe.edu.hwabstractfactory.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class FormModel {

    private Map<String, String> fields;

    public FormModel() {
        fields = new HashMap<>();
    }

    public void addField(String fieldName, String fieldValue) {
        fields.put(fieldName, fieldValue);
    }

    public String getField(String fieldName) {
        return fields.get(fieldName);
    }

    public Map<String, String> getAllFields() {
        return fields;
    }

    public void updateField(String fieldName, String fieldValue) {
        fields.put(fieldName, fieldValue);
    }

}
