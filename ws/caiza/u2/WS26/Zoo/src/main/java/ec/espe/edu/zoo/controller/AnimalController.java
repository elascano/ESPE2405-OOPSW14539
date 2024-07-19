package ec.espe.edu.zoo.controller;

import ec.edu.espe.zoo.utils.MongoDBField;
import ec.espe.edu.zoo.model.Animal;

/**
 *
 * @author G400
 */
public class AnimalController {

    public boolean create(Animal animal) {
        try {
            //call the function to upload the data
            MongoDBField.uploadAnimalData(animal);
            return true; // if there are not expections, save animal
        } catch (Exception e) {
            e.printStackTrace();
            return false; // if there are an exception exist, create a Fail
        }
    }
}
