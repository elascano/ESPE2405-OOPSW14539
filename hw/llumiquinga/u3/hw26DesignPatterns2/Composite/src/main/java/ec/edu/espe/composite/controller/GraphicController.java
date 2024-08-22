/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.composite.controller;

import ec.edu.espe.composite.model.Component;
import ec.edu.espe.composite.model.Composite;
import ec.edu.espe.composite.model.Leaf;

/**
 *
 * @author G403
 */
public class GraphicController {
      private Composite root;

    public GraphicController() {
        root = new Composite("Root");
        setupHierarchy();
    }

    private void setupHierarchy() {
        Composite comp1 = new Composite("Composite 1");
        Composite comp2 = new Composite("Composite 2");
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");
        Leaf leaf3 = new Leaf("Leaf 3");

        comp1.add(leaf1);
        comp1.add(leaf2);
        comp2.add(leaf3);
        root.add(comp1);
        root.add(comp2);
    }

    public Component getRoot() {
        return root;
    }
}
