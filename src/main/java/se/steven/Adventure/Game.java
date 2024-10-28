package se.steven.Adventure;

import java.util.Scanner;

import static se.steven.Adventure.Creature.fightOneRound;

public class Game extends Creature {
    Scanner sc = new Scanner(System.in);

    // Constructors
    Player player = new Player(100, 24, "Steven");
    Monster monster = new Monster(25, 10, "Goblin");

    // Constants
    private final static String NORTH = "North";
    private final static String EAST = "East";
    private final static String SOUTH = "South";
    private final static String WEST = "West";
    private final static String TOWN_CENTRE = "Town Centre";
    private final static String GAME_START = "Start";
    private static String currentLocation = GAME_START;

    Game(int health, int damage, String name) {
        super(health, damage, name);
    }


    // Initiates the adventure
    public void gameStart() {
        boolean running = true;

        while (running) {
            System.out.println("You can go North, East, South, West, to Town or to Battle. Quit to Exit. ");
            String choice = sc.nextLine();

            switch (choice) {
                case "Go North" -> North();
                case "Go East" -> East();
                case "Go South" -> South();
                case "Go West" -> West();
                case "Go to Town" -> townCentre();
                case "Battle" -> fightOneRound(player, monster);
                case "Quit" -> running = false;
            }
        }
    }

    public void townCentre() {
      if (!currentLocation.equals(TOWN_CENTRE)) {
      //    System.out.println("You can go North, East, South or West. ");
            currentLocation = TOWN_CENTRE;
      } else {
        System.out.println("You cannot go that way yet. ");
      }
    }

 {
 }


    private void North() {
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


    public void takeDamage(int damage) {

    }

    public void attack(Creature toAttack) {
        toAttack.takeDamage(damage);
    }


    public boolean isAlive() {
        return health > 0;
    }


    public static void executeAttack(Creature attacker, Creature defender) {
        attacker.takeDamage(attacker.damage);
        System.out.println(attacker.name + " has attacked " + defender.name);
        defender.takeDamage(attacker.damage);
        defender.health -= attacker.damage;
        if (defender.isAlive()) {
            System.out.println(defender.name + " now has " + defender.health + " health");
        }   else {
            System.out.println(defender.name + " is dead");
            System.out.println("You take your loot back to town.");
            currentLocation = TOWN_CENTRE;

        }
    }


    public static void fightOneRound(Creature attacker, Creature defender) {
        executeAttack(attacker, defender);

        if(defender.health > 0) {
            executeAttack(defender, attacker);
        }
    }









}












