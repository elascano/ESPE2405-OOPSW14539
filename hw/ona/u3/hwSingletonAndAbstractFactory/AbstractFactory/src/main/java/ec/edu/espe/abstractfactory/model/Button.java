/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Leydi Oña
 */
abstract class Button {
    public String caption;

    public Button(String caption) {
        this.caption = caption;
    }
    
    public abstract void paint();
}
