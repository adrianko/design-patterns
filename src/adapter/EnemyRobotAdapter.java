package adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot e) {
        enemyRobot = e;
    }

    @Override
    public void fireWeapon() {
        
    }

    @Override
    public void driveForward() {

    }

    @Override
    public void assignDriver(String d) {

    }
}
