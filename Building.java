package Task3;

import java.util.ArrayList;

// 3.d opret en klasse men navnet Building
public class Building {
//3.d Attribut til at holde flere room objekter
    private ArrayList<Room>rooms;
    private int numberOfFloors ;

//3.e konstruktør
    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

 //3.f getter og setter
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room>rooms) {
        this.rooms = rooms;
    }

}
