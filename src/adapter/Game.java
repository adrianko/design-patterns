package adapter;

public class Game {

    public static void main(String[] args) {
        EnemyTank et = new EnemyTank();
        EnemyRobot er = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(er);

        System.out.println("Robot");
        er.reactToHuman("Dan");
        er.walkForward();
        er.smashWithHands();

        System.out.println("Tank");
        et.assignDriver("Tom");
        et.driveForward();
        et.fireWeapon();

        System.out.println("Robot Adapter");
        robotAdapter.assignDriver("Fred");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }

}