package factory;

import java.util.Scanner;

public class Game {

    /**
     * The factory produces the subclasses that can be used meaning that should
     * a new ship type be added, it only needs to be in one place, the factory.
     * @param args
     */
    public static void main(String[] args) {
        Factory f = new Factory();
        EnemyShip e = null;
        Scanner ui = new Scanner(System.in);
        System.out.println("Ship type? (u/b/r):");

        if (ui.hasNextLine()) {
            e = f.makeEnemyShip(ui.nextLine());
        }

        if(e != null) {
            doEnemyStuff(e);
        }
    }

    public static void doEnemyStuff(EnemyShip e) {
        e.displayEnemyShip();
        e.followHeroShip();
        e.enemyShipShoots();
    }

}
