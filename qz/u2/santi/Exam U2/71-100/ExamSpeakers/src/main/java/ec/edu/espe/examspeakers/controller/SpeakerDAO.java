
package ec.edu.espe.examspeakers.controller;

import ec.edu.espe.examspeakers.model.Speaker;
import java.util.List;

/**
 *
 * @author Sjean
 */
public interface SpeakerDAO {
    void create(Speaker speaker);
    Speaker read(String id);
    void update(Speaker speaker);
    void delete(String id);
    List<Speaker> listAll();
}
