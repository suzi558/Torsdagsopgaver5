package Task3;

import java.util.ArrayList;

//3.g opret en main klasse
public class Main {
    public static void main(String[] args) {

        Room room1 = new Room (3,2);    //instansier tre rum
        Room room2 = new Room (4,1);
        Room room3 = new Room (2,3);


 //3.h tilføj rummene til en samling
        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

// 3.i instansier en ny bygning med de oprettede rum
        Building building = new Building(roomList, 2);
        System.out.println("Total lamps in building: " + countLanmpsInBuilding(building));
        System.out.println("Total windows in building: " + countWindowsInBuilding(building));
        System.out.println("Total rooms in building: " + countRoomsInBuilding(building));

// 3.k tesi isNormal metode
        System.out.println("Is the building normal? " + isNormal (building));
        Building abnormalBuilding = new Building(roomList, 1);  //unormal bygning
        System.out.println("Is the abnormal building normal? " + isNormal(abnormalBuilding));
    }

//3.j metode til at tælle lamper i bygningen
    public static int countLanmpsInBuilding (Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLambs();
        }
        return totalLamps;
    }


    public static int countWindowsInBuilding(Building building) {      //tæller vinduer i bygningen
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }


    public static int countRoomsInBuilding(Building building) {     //tæller rum i bygningen
        return building.getRooms().size();
    }


    public static boolean isNormal (Building building) {        //tjekker om bygningen er normal 
        return building.getNumberOfFloors() >= building.getRooms().size();
    }
}
