package structural.adapter;

import java.util.Random;

public class EnemyRobot {

    Random gen = new Random();

    public void smashWithHands() {
        System.out.println("Enemy Robot causes " + (gen.nextInt(10) + 1) + " damage");
    }

    public void walkForward() {
        System.out.println("Enemy Robot walks forward " + (gen.nextInt(5) + 1) + " spaces");
    }

    public void reactToHuman(String d) {
        System.out.println("Enemy Robot tramps on " + d);
    }

}