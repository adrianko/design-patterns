package factory;

import java.util.Scanner;

public class Game {

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
