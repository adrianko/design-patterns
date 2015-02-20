package creational.builder.robot;

public class RobotEngineer {
    
    private RobotBuilder rb;
    
    public RobotEngineer(RobotBuilder r) {
        rb = r;
    }
    
    public Robot getRobot() {
        return rb.getRobot();
    }
    
    public void makeRobot() {
        rb.buildRobotHead();
        rb.buildRobotTorso();
        rb.buildRobotArms();
        rb.buildRobotLegs();
    }
    
}