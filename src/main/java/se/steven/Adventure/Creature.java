package se.steven.Adventure;



public class Creature {

    int health;
    int damage;
    String name;

    Creature(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
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

        }
    }


    public static void fightOneRound(Creature attacker, Creature defender) {
        executeAttack(attacker, defender);

        if(defender.health > 0) {
            executeAttack(defender, attacker);
        }
    }
}