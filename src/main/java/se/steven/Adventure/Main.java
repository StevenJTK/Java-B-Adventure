package se.steven.Adventure;

public class Main {
    public static void main(String[] args) {

   Game game = new Game(100, 25, "Dragonborn");

    System.out.println("Welcome to the game! You may choose the following options:");

    game.townCentre();
    game.gameStart();


    }
}