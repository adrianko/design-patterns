package abstractfactory;

public class Game {

    /**
     *
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