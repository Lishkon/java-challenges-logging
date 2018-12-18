package HackerRank.Day19Tutorial;

import java.util.Random;

public class StarWarsInterfacePractice {
    public static Character summonCharacter(){
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy dartVader = new Enemy();
        Hero obiWanKenobi = new Hero();
        dartVader.attack();
        obiWanKenobi.attack();
        dartVader.heal();
        obiWanKenobi.heal();
        System.out.println("Enemy's weapon: " + dartVader.getWeapon());
        System.out.println("Hero's weapon: " + obiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
