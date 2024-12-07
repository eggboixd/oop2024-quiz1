package Q17;

public class Enemy {


    /*
     * set variables for name, health, power, and defense for enemy
     */
    private String name;
    private int health;
    private int power;
    private int defense;


    //constructor
    public Enemy(String name, int health, int power, int defense){
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }


    //getters to intialize the value
    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getPower(){
        return power;
    }

    public int getDefense(){
        return defense;
    }

    //setters
    public void setHealth(int health){
        this.health = health;
    }

    public void setPower(int power){
        this.power = power;
    }

    public void setDefense(int defense){
        this.defense = defense;
    }

    //enemy attack player
    public void attack(Player player){
        System.out.println(this.name + "attacked" + player.getName());
        player.takeDamage(this.power);
    }

    //enemy takes damage from player
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
