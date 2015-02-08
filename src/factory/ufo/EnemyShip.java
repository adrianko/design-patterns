package factory.ufo;

public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public void followHeroShip() {
        System.out.println(name + " following hero.");
    }

    public void displayEnemyShip() {
        System.out.println(name + " on screen.");
    }

    public void enemyShipShoots() {
        System.out.println(name + " attacks and does " + amtDamage + " damage.");
    }

    public void setName(String n) {
        name = n;
    }

    public void setDamage(double d) {
        amtDamage = d;
    }

}
