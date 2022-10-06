package Task2;

import Task1.Driver;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //instiate three diffrent rooms
        Room room0 = new Room(1, 2, 1);
        Room room1 = new Room(2, 3, 2);
        Room room2 = new Room(3, 4, 3);

        //Add the three rooms to a collection.
        ArrayList<Room> collection = new ArrayList<>();
        collection.add(room0);
        collection.add(room1);
        collection.add(room2);

        //In your main method, instantiate a new building.
        Building building0 = new Building(collection, 2, 3, true);

        //prints out and calls method
        System.out.println(countLampsInBuild(building0));

        //prints and call method
        System.out.println(isNormal(building0));
    }

    //Create a static method in Main, countLampsInBuilding, that takes an object of type Building, and returns the total number of lamps in the entire building.
    public static int countLampsInBuild(Building building) {
        int numOfLamps = 0;
        for (int i = 0; i < building.getRooms().size(); i++) {
            numOfLamps += building.getRooms().get(i).getNumberOfLamps();
        }
        return numOfLamps;
    }

    //create another static method in Main, isNormal, that takes an object of type Building.
    //The method should return true if the Building's numberOfFloors is greater than its number of Rooms.
    //If not it should print "This is an odd building" and return false.
    public static boolean isNormal (Building build){
    if (build.getNumberOfFloors() > build.getRooms().size()) {
        return true;
        }
      else {
            System.out.println("This is an odd build");
            return false;
        }
    }
}
