package abstractfactory.ufo;

public class UFOEnemyShip extends EnemyShip {

    EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory sf) {
        shipFactory = sf;
    }

    @Override
    void makeShip() {
        System.out.println("Making: " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }

}