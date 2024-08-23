
package ec.espe.edu.mazegenerator.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Alvarado Grefa Frank, As Byte Wizards, DCCO-ESPE
 */
public class MazeGeneratorMain {
    public static void main(String[] args){
        String xStr = JOptionPane.showInputDialog(null, "Ingrese el numero de columnas:");
        int x = Integer.parseInt(xStr);
        
        String yStr = JOptionPane.showInputDialog(null, "Ingrese el valor de filas:");
        int y = Integer.parseInt(yStr);
        ASCII maze = new ASCII(x,y);
        maze.displayMaze();
        
        maze.resolveMaze();
        System.out.println("\n\n");
        
        maze.displayMaze();
    }
}
