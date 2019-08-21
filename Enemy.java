public class Enemy implements Actor
{
    // Instance Variables
    int lives = 0, health = 0;
    String name = "", weapon = "";

    // Constructors
    public Enemy()
    {
        name = "Blob";
        weapon = "None";
    }

    public Enemy(String name, String weapon, int lives, int health)
    {
        this.name = name;
        this.weapon = weapon;
        this.lives = lives;
        this.health = health;
    }

    // Setters & Getters


    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }
    public int getHealth()
    {
        return health;
    }

    public void setLives(int lives)
    {
        this.lives = lives;
    }
    public int getLives()
    {
        return lives;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }
    public String getWeapon()
    {
        return weapon;
    }

    // Brain Methods
    @Override
    public void Attack(int damage)
    {

    }

    // toString
    public String toString()
    {
        return "Lives: " + lives +
                " | Health: " + health +
                " | Name: " + name +
                " | Weapon: " + weapon;
    }

} // end class Enemy
