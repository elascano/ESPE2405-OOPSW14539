package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Condor extends Bird {

    private String mountain;

    public Condor(String mountain, int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
        this.mountain = mountain;
    }

    @Override
    public String toString() {
        return "Condor{" + "mountain=" + mountain + '}' + super.toString();
    }

    @Override
    public void feed(int food) {
        System.out.println("Feeding a Condor with " + food + "pounds of meat");
    }

    /**
     * @return the mountain
     */
    public String getMountain() {
        return mountain;
    }

    /**
     * @param mountain the mountain to set
     */
    public void setMountain(String mountain) {
        this.mountain = mountain;
    }

}
