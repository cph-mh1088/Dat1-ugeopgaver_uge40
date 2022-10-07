package Task2;

public class Room {

    //fields (instance variables,attributes)
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;


    //constructor. Initializes the fields.
    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //getters for fields.
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
