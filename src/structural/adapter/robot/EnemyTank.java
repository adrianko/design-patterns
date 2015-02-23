package structural.adapter.robot;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    Random gen = new Random();

    @Override
    public void fireWeapon() {
        System.out.println("Enemy Tank does " + (gen.nextInt(10) + 1) + " damage");
    }

    @Override
    public void driveForward() {
        System.out.println("Enemy Tank moves " + (gen.nextInt(5) + 1) + " spaces");
    }

    @Override
    public void assignDriver(String d) {
        System.out.println(d + " is driving the tank");
    }

}