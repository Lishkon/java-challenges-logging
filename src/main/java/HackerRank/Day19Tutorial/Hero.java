package HackerRank.Day19Tutorial;

public class Hero implements Character {

    public String weapon = "lightsaber";

    @Override
    public String getWeapon() {
        return weapon;
    }

    @Override
    public void attack() {
        System.out.println("The Hero attacks the enemy");
    }

    @Override
    public void heal() {
        System.out.println("The Hero heals you");
    }
}
