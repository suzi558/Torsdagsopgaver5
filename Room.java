package Task3;

// 3.a opret klasse room
public class Room {
    private int numberOfLambs;
    private int numberOfWindows;

//3.b konstruktør
    public Room(int numberOfLambs, int numberOfWindows) {
        this.numberOfLambs = numberOfLambs;
        this.numberOfWindows = numberOfWindows;
    }

//3.c getters og setters
    public int getNumberOfLambs() {
        return numberOfLambs;
    }

    public void setNumberOfLambs(int numberOfLambs) {
        this.numberOfLambs = numberOfLambs;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

}
