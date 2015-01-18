package factory;

public class Factory {

    public EnemyShip makeEnemyShip(String n) {
        switch(n.charAt(0)) {
            case 'u':
                return new UFOEnemyShip();
            case 'r':
                return new RocketEnemyShip();
            case 'b':
                return new BigUFOEnemyShip();
            default:
                return new UFOEnemyShip();
        }
    }
}
