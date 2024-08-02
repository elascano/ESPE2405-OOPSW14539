package com.mycompany.areacono;

import ec.edu.espe.areacono.model.Cono;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class AreaCono {

    public static void main(String[] args) {
        Cono cono = new Cono(3, 4);
       
        System.out.println(" ---> Total area of a cone: " + cono.calcularAreaTotal());
    }
    }

