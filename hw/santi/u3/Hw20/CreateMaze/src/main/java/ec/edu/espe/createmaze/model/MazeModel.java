
package ec.edu.espe.createmaze.model;

import ec.edu.espe.createmaze.view.MazeView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sjean
 */
public class MazeModel {
    private Maze maze;
    private List<MazeView> observers = new ArrayList<>();

    public void generateMaze(int width, int height) {
        MazeGenerator generator = new MazeGenerator(width, height);
        maze = generator.generateMaze();
        notifyObservers();
    }

    public Maze getMaze() {
        return maze;
    }

    public void addObserver(MazeView observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (MazeView observer : observers) {
            observer.update();
        }
    }
}