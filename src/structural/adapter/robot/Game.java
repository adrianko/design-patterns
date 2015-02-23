package structural.adapter.robot;

public class Game {

    /**
     * Adapter - allows 2 incompatible interfaces to work together. Used when client
     * expects to use a target interface. Adapter class allows the use of the available
     * interface with Target interface.
     * In this case the RobotAdapter maps expected methods to methods found within
     * the EnemyRobot class.
     * @param args
     */
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