
package ec.edu.espe.examspeakers.controller;

import ec.edu.espe.examspeakers.model.Speaker;
import java.util.List;

/**
 *
 * @author Sjean
 */
public class SpeakerController {
    private SpeakerDAO speakerDAO;

    public SpeakerController(SpeakerDAO speakerDAO) {
        this.speakerDAO = speakerDAO;
    }

    public void createSpeaker(Speaker speaker) {
        speakerDAO.create(speaker);
    }

    public Speaker readSpeaker(String id) {
        return speakerDAO.read(id);
    }

    public void updateSpeaker(Speaker speaker) {
        speakerDAO.update(speaker);
    }

    public void deleteSpeaker(String id) {
        speakerDAO.delete(id);
    }

    public List<Speaker> listAllSpeakers() {
        return speakerDAO.listAll();
    }
}