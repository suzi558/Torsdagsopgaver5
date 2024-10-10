package Task2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//opgave 2.c opret en klasse med navnet cafe
public class Cafe {
    private ArrayList<String> coffeeMenu;      //Attributer til kaffe-menu

    public Cafe() {         //konstruktor
        coffeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCoffeeMenu() {      //getter til kafe-menu
        return coffeeMenu;
    }

    public void loadMenuData() {        //metode for at læse menu-data fra filen
        File file = new File("cofees.txt");     // file objekt for at repræsentere filen

        try (Scanner ns = new Scanner(file)){//læser fra filen med scanner
            while (ns.hasNextLine()) {      //2.e læser linjer indtil der ikker er flere
                coffeeMenu.add(ns.nextLine());    //tilføjer hver linje til liste
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        }
    }

}
