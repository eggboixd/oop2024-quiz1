package Q17;

public class Player {

    /*
     * 
     * same as previous enemy class, set variables first and initialize them using getter and setter functions below
     */

    private String name;
    private int health;
    private int power;
    private int defense;

    // constructor
    public Player(String name, int health, int power, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public int getDefense() {
        return defense;
    }

    // setters
    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // attack method
    public void attack(Enemy enemy) {
        System.out.println(this.name + " attacks " + enemy.getName());
        enemy.takeDamage(this.power);
    }

    // method to take damage
    public void takeDamage(int attackPower) {
        int damage = attackPower - this.defense;
        if (damage > 0) {
            this.health -= damage;
        }
        System.out.println(this.name + " takes " + damage + " damage, health is now " + this.health);
        if (this.health <= 0) {
            System.out.println(this.name + " died!");
        }
    }
}
