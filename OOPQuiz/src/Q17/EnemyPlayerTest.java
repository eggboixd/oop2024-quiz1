package Q17;

public class EnemyPlayerTest {
    /*
    for this example i set the hero's health to 100 and goblin's health to 80 with the powers and defense as shown in the
    parameters of the function below
     */

    public static void main(String[] args) {
        // create a player and an enemy
        Player player = new Player("Hero", 100, 20, 10);
        Enemy enemy = new Enemy("Goblin", 80, 15, 5);

        // player attacks enemy
        player.attack(enemy);

        // enemy attacks player
        enemy.attack(player);

        // repeat until one of them dies
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            player.attack(enemy);
            if (enemy.getHealth() <= 0) break;

            enemy.attack(player);
        }
    }
}
