package builder;

public class Order {
    
    public static void main(String[] args) {
        RobotEngineer re = new RobotEngineer(new OldRobotBuilder());
        re.makeRobot();
        
        Robot r = re.getRobot();
        System.out.println("Robot built");
        System.out.println("Head: " + r.getRobotHead());
        System.out.println("Torso: " + r.getRobotTorso());
        System.out.println("Arms: " + r.getRobotArms());
        System.out.println("Legs: " + r.getRobotLegs());
    }
    
}