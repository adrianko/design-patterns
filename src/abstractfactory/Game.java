package abstractfactory;

public class Game {

    /**
     * Every step is separated by either an abstract class or an interface making
     * it possible to make extremely flexible objects.
     * @param args
     */
    public static void main(String[] args) {
        EnemyShipBuilding esb = new UFOEnemyShipBuilding();
        EnemyShip es = esb.orderShip("UFO");
        System.out.println(es);

        EnemyShip boss = esb.orderShip("UFO BOSS");
        System.out.println(boss);
    }

}