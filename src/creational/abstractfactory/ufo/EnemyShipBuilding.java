package creational.abstractfactory.ufo;

public abstract class EnemyShipBuilding {

    protected abstract EnemyShip makeEnemyShip(String type);

    public EnemyShip orderShip(String type) {
        EnemyShip es = makeEnemyShip(type);

        es.makeShip();
        es.displayEnemyShip();
        es.followHeroShip();
        es.shoot();

        return es;
    }

}
