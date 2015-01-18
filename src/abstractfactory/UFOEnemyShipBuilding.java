package abstractfactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    protected EnemyShip makeEnemyShip(String type) {
        EnemyShip es = null;

        if (type.equals("UFO")) {
            es = new UFOEnemyShip(new UFOEnemyShipFactory());
            es.setName("UFO Grunt Ship");
        } else if (type.equals("UFO BOSS")) {
            es = new UFOBossEnemyShip(new UFOBossEnemyShipFactory());
            es.setName("UFO Boss Ship");
        }
        
        return es;
    }

}