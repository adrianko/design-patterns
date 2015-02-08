package creational.builder;

public class Order {

    /**
     * Builder - many classes help in the creation of an object. By having different 
     * classes build the object, many different types of objects can be created
     * without forced rewriting of code.
     * @param args
     */
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