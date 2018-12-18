package HackerRank.Day19Tutorial;

public class Enemy implements Character {
    public String weapon = "lightsaber";

    public Enemy() {}

    @Override
    public String getWeapon() {
        return weapon;
    }

    @Override
    public void attack() {
        System.out.println("The enemy attacks YOU!!!");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals himself");
    }

    public void weaponDraw() {
        System.out.println("Draw out weapon");
    }
}
