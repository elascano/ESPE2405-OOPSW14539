/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw27strategy.controller;

import ec.edu.espe.hw27strategy.model.SortingContext;

/**
 *
 * @author Erick Tufiño
 */
public class SortController {
    
    public String processInput(String input) {
      
        String[] stringNumbers = input.split(",");
        int[] numbers = new int[stringNumbers.length];

        
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i].trim());
        }

        
        SortingContext sc = new SortingContext();
        int[] sortedNumbers = sc.sort(numbers);

       
        StringBuilder sortedOutput = new StringBuilder();
        for (int num : sortedNumbers) {
            sortedOutput.append(num).append(", ");
        }

       
        if (sortedOutput.length() > 0) {
            sortedOutput.setLength(sortedOutput.length() - 2);
        }

        return sortedOutput.toString();
    }
}
