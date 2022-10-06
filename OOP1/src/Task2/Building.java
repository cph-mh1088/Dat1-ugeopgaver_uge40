package Task2;

import java.util.ArrayList;

public class Building {

    //fields (instance variables/attributes)
    private final ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;


    //constructor
    public Building(ArrayList<Room> rooms, int numberOfBathrooms,int numberOfFloors, boolean isOfficeBuilding){
    this.rooms = rooms;
    this.numberOfBathrooms = numberOfBathrooms;
    this.numberOfFloors = numberOfFloors;
    this.isOfficeBuilding = isOfficeBuilding;

    }

    //getters for fields
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
