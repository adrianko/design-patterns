package abstractfactory;

public class UFOBossEnemyShip extends EnemyShip {

    EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory sf) {
        shipFactory = sf;
    }

    @Override
    void makeShip() {
        System.out.println("Making: " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }

}