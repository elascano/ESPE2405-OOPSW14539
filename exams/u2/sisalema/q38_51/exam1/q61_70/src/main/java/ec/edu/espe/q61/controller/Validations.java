package ec.edu.espe.q61.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Yostin Sisalema, Code Master, DCCO-ESPE
 */
public class Validations {
        public boolean getIntInput(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public boolean getDoubleInput(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public boolean getStringInput(String value){
    return value.matches("[a-zA-Z]+");
    }
    public void validateField(JTextField field, boolean isValid) {
        if (!isValid) {
            field.setForeground(Color.RED);
        } else {
            field.setForeground(Color.BLACK);
            field.setBackground(Color.WHITE);
        }
    }
    public void addKeyListener(JTextField field, final boolean isString) {
        field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String input = field.getText();
                if (isString) {
                    validateField(field, getStringInput(input));
                } else {
                    validateField(field, getDoubleInput(input));
                }
            }
        });
    }
}
