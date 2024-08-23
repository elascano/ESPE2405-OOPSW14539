
package ec.espe.edu.mazegenerator.controller;

import ec.espe.edu.mazegenerator.model.Room;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alvarado Grefa Frank, As Byte Wizards, DCCO-ESPE
 */
public class MazeGenerator {
    private Room[][] map;
    private Room entranceRoom;
    private Room outputRoom;
    private ArrayList<Room> path = new ArrayList<>();
    
    public void generateMaze(Room[][] baseMaze){
        this.map = baseMaze;
        defineEntrances();
        definePath();        
    }
    
    private void defineEntrances(){
        int width = map.length;
        int height = map[0].length;
        Random random = new Random();
        int rng;
        
        rng = random.nextInt(0, height);
        
        entranceRoom = new Room(0,rng);
        entranceRoom.getWalls()[1].setState(false);
        entranceRoom.setType("start");
        entranceRoom.setPassed(true);
        path.add(entranceRoom);
        
        map[0][rng] = entranceRoom;
        
        rng = random.nextInt(0, height);
        
        outputRoom = new Room(width-1,rng);
        outputRoom.getWalls()[3].setState(false);
        outputRoom.setType("end");
                
        map[width-1][rng] = outputRoom;
    }
    
    private void definePath(){
        int direction;
        boolean hasPassed;
        int attempts=0;
        Random random = new Random();
        
        Room currentRoom;
        
        
        while(path.size()>0){
            currentRoom = path.get(path.size()-1);
            hasPassed=false;
            attempts=0;
            
            while (!hasPassed && attempts < 10) {
                attempts++;
                direction = random.nextInt(0, 4);
                hasPassed = validateDirection(direction, currentRoom);
            }

            if (!hasPassed) {
                path.remove(path.size()-1);
            }
        }
        
    }
    
    public boolean validateDirection(int direction, Room currentRoom){
        boolean canContinue=false;
        
        switch(direction){
            case 0:
                canContinue=validateNorth(currentRoom);
                break;           
            case 1:
                canContinue=validateWest(currentRoom);
                break;    
            case 2:
                canContinue=validateSouth(currentRoom);
                break;   
            case 3:
                canContinue=validateEast(currentRoom);
                break;
        }
        
        return canContinue;
    }
    
    public boolean validateNorth(Room currentRoom){
        boolean passed = false;
        
        if (currentRoom.getPosY() > 0) {
            Room nextRoom = map[currentRoom.getPosX()][(currentRoom.getPosY()-1)];
            if (!nextRoom.isPassed()) {
                currentRoom.getWalls()[0].setState(false);
                nextRoom.getWalls()[2].setState(false);

                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
    public boolean validateWest(Room currentRoom){
        boolean passed = false;
        
        if (currentRoom.getPosX() > 0) {
            Room nextRoom = map[(currentRoom.getPosX()-1)][currentRoom.getPosY()];
            if (!nextRoom.isPassed()) {
                currentRoom.getWalls()[1].setState(false);
                nextRoom.getWalls()[3].setState(false);

                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
    public boolean validateSouth(Room currentRoom){
        boolean passed = false;
        int height = map[0].length;
        
        if (currentRoom.getPosY() < (height - 1)) {
            Room nextRoom = map[currentRoom.getPosX()][(currentRoom.getPosY()+1)];
            if (!nextRoom.isPassed()) {
                currentRoom.getWalls()[2].setState(false);
                nextRoom.getWalls()[0].setState(false);

                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
    public boolean validateEast(Room currentRoom){
        boolean passed = false;
        int width = map.length;
        
        if (currentRoom.getPosX() < (width - 1)) {
            Room nextRoom = map[(currentRoom.getPosX()+1)][currentRoom.getPosY()];
            if (!nextRoom.isPassed()) {
                currentRoom.getWalls()[3].setState(false);
                nextRoom.getWalls()[1].setState(false);

                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
}
