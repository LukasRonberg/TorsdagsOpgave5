package Task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();




        Room room1 = new Room(2, 10, 5);
        Room room2 = new Room(2, 15, 7);
        Room room3 = new Room(2, 19, 10);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building house1 = new Building(rooms, 2, 3, false);
        int totalLamps = countLampsInBuilding(house1);
        System.out.println(totalLamps);

        isNormal(house1);

    }
    static public int countLampsInBuilding(Building house1){
        int totalLamps = 0;
        ArrayList<Room> rooms = house1.getRooms();
        for (Room room:rooms){
totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    static public boolean isNormal(Building house1){
        if (house1.getNumberOfFloors() > house1.getRooms().size()) {
            System.out.println("This is a normal building.");
            return true;
        } else {
            System.out.println("This is an odd building.");
            return false;
        }



    }
}
