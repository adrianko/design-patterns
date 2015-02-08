package creational.abstractfactory.ufo;

public abstract class EnemyShip {

    private String name;
    ESWeapon weapon;
    ESEngine engine;

    abstract void makeShip();

    public void followHeroShip() {
        System.out.println(name + " following hero.");
    }

    public void displayEnemyShip() {
        System.out.println(name + " on screen.");
    }

    public void shoot() {
        System.out.println(name + " attacks and does " + weapon);
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " has top speed of " + engine + " and attack of " + weapon;
    }

}