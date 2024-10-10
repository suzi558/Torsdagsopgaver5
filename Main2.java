package Task2;

import java.util.ArrayList;

//opgave 2.b lav en main klasse
public class Main2 {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();     //opretter en instans af cafe
//opgave 2.g indlæser kaffe menu fra filen
        cafe.loadMenuData();

 //opgave 2.h print kaffe menu
        ArrayList<String> coffeeMenu = cafe.getCoffeeMenu();
        System.out.println("Coffee Menu: ");
        for (String coffee : coffeeMenu) { //henter og printer kaffe menu
            System.out.println(coffee);
        }

    }
}
