package structural.adapter.robot;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot e) {
        enemyRobot = e;
    }

    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String d) {
        enemyRobot.reactToHuman(d);
    }
}