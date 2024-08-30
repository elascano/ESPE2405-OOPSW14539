package ec.espe.edu.mazegenerator.controller;

import ec.espe.edu.mazegenerator.model.Room;
import java.util.ArrayList;

/**
 *
 * @author Alfonso, As Byte Wizards, DCCO-ESPE
 */
public class MazeResolver implements InterfaceMazeGenerator{
    private Room[][] map;
    private int x;
    private int y;
    
    private ArrayList<Room> path = new ArrayList<>();
    
    public void resolveMaze(Room[][] baseMaze){
        this.map = baseMaze;
        this.x = map.length;
        this.y = map[0].length;
        clearVisitedRoom();
        locateStart();
        generatePath();        
    }
    
    private void clearVisitedRoom(){
        for(int j=0;j<y;j++){
            for(int i=0;i<x;i++){
                map[i][j].setPassed(false);
           }
        }
    }
    
    private void locateStart(){
        
        for(int j=0;j<y;j++){
            if ("start".equals(map[0][j].getType())) {
                map[0][j].setPassed(true);
                path.add(map[0][j]);
            }
        }
    }
    
    
    private void generatePath(){
        boolean hasPassed;
        int attempts;
        int direction;
        
        Room currentRoom;
        
        
        while(path.size()>0){
            currentRoom = path.get(path.size()-1);
            hasPassed=false;
            attempts=0;
            direction=0;
            
            while (!hasPassed && direction<4 && attempts<10) {
                attempts++;
                hasPassed = validateDirection(direction, currentRoom);
                direction++;
            }

            if (!hasPassed) {
                path.get(path.size()-1).setType("default");
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
        boolean isClosed = currentRoom.getWalls()[0].getState();
        
        
        if (!isClosed) { 
            Room nextRoom = map[currentRoom.getPosX()][(currentRoom.getPosY()-1)];
            if (!nextRoom.isPassed()) {
                
                if(!"end".equals(nextRoom.getType())){
                    nextRoom.setType("path");
                }
                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
    public boolean validateWest(Room currentRoom){
        boolean passed = false;
        boolean isClosed = currentRoom.getWalls()[1].getState();
        
        
        if("start".equals(currentRoom.getType())){
            isClosed = true;
        }
        
        if (!isClosed) {
            Room nextRoom = map[(currentRoom.getPosX()-1)][currentRoom.getPosY()];
            if (!nextRoom.isPassed()) {

                if(!"end".equals(nextRoom.getType())){
                    nextRoom.setType("path");
                }
                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
    public boolean validateSouth(Room currentRoom){
        boolean passed = false;
        boolean isClosed = currentRoom.getWalls()[2].getState();
        
        if (!isClosed) {
            Room nextRoom = map[currentRoom.getPosX()][(currentRoom.getPosY()+1)];
            if (!nextRoom.isPassed()) {

                if(!"end".equals(nextRoom.getType())){
                    nextRoom.setType("path");
                }
                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
    public boolean validateEast(Room currentRoom){
        boolean passed = false;
        boolean isClosed = currentRoom.getWalls()[3].getState();
        
        
        
        if("end".equals(currentRoom.getType())){
            isClosed = true;
            path.clear();
            path.add(new Room(-1,-1));
        }
        
        
        if (!isClosed) {
            Room nextRoom = map[(currentRoom.getPosX()+1)][currentRoom.getPosY()];
            if (!nextRoom.isPassed()) {
                
                if(!"end".equals(nextRoom.getType())){
                    nextRoom.setType("path");
                }
                nextRoom.setPassed(true);
                path.add(nextRoom);
                passed = true;
            }
        }
        return passed;
    }
    
}
