package ec.edu.espe.saveanobject.view;

import ec.edu.espe.saveanobject.model.Toy;
import utils.SerializeUtil;

/**
 * Clase principal para probar la serialización y deserialización de objetos Toy.
 * 
 * @autor Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class ToySave {
    public static void main(String[] args) {
        Toy toy = new Toy(1, "Lego Figure", "Lego", "Plastic", false);
        SerializeUtil.saveToFile("toy.toy", toy);
        Toy deserializedToy = (Toy) SerializeUtil.readFromFile("toy.toy");
        System.out.println("Objeto deserializado: " + deserializedToy);
    }
}
