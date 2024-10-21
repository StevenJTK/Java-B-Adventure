package se.steven.Adventure;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);

    // Constants
    private final static String NORTH = "North";
    private final static String EAST = "East";
    private final static String SOUTH = "South";
    private final static String WEST = "West";
    private final static String TOWN_CENTRE = "Town Centre";
    private final static String GAME_START = "Start";
    private static String currentLocation = GAME_START;


    // Initiates the adventure
    public void gameStart() {
        boolean running = true;

        while (running) {
          //  System.out.println("You can go North, East, South or West. ");
            String choice = sc.nextLine();

            switch (choice) {
                case "Go North" -> North();
                case "Go East" -> East();
                case "Go South" -> South();
                case "Go West" -> West();
                case "Go to Town" -> System.out.println("You head towards the closest town.");
                case "Quit" -> running = false;
            }
        }
    }

    public static void townCentre() {
      if (!currentLocation.equals(TOWN_CENTRE)) {
          System.out.println("You can go North, East, South or West. ");
            currentLocation = TOWN_CENTRE;
      } else {
        System.out.println("You cannot go that way yet. ");
      }
    }

 {
 }


    void North() {
        if (currentLocation.equals(TOWN_CENTRE)) {
            System.out.println("Going North");
            currentLocation = NORTH;
        }

        else {
        System.out.println("You cannot go that way at this time. ");
        }
    }
    void East() {
        if (currentLocation.equals(TOWN_CENTRE)) {
        System.out.println("Going East");
        currentLocation = EAST;
        } else {
            System.out.println("You cannot go that way at this time. ");
         }
        }


    void South() {
        if (currentLocation.equals(TOWN_CENTRE)) {
            System.out.println("Going South");
            currentLocation = SOUTH;

        } else {
            System.out.println("You cannot go that way at this time. ");
        }
    }

    void West() {
        if (currentLocation.equals(TOWN_CENTRE)) {
            System.out.println("Going West");
            currentLocation = WEST;

        }   else {
            System.out.println("You cannot go that way at this time. ");
        }
    }
}
