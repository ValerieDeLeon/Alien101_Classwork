public class Fighter implements Actor
{
    // Instance Variables
    private int level = 0, xp = 0;
    private int lives = 0, health = 0;
    private String rank = "";
    private String name = "", weapon = "";
    private static final int NUMLIVES = 3;

    // Constructors
    public Fighter()
    {
        level = 0;
        xp = 0;
        lives = NUMLIVES;
        health = 150;
        rank = "None";
        name = "John Doe";
        weapon = "Noodle";
    } // Default constructor

    // This is an overload constructor with more details
    public Fighter(String rank, String name, String weapon, int level, int xp, int health)
    {
        this.rank = rank;
        this.name = name;
        this.weapon = weapon;
        this.level = level;
        this.xp = xp;
        this.health = health;
    } // end 3 arg constructor

    // Getters & Setters
    public void setRank(String rank)
    {
        this.rank = rank;
    }
    public String getRank()
    {
        return rank;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }
    public String getWeapon()
    {
        return weapon;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }
    public int getLevel()
    {
        return level;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }
    public int getXp()
    {
        return xp;
    }

    public void setLives(int lives)
    {
        this.lives = lives;
    }
    public int getLives()
    {
        return lives;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }
    public int getHealth()
    {
        return health;
    }

    // Brain Methods
    @Override
    public void Attack(int damage)
    {

    }

    // toString
    public String toString()
    {
        return "~Fighter~\n" + "Rank: " + rank + " | Name : " + name + " | Weapon: " + weapon + " | Level: " + level + " | XP: " + xp + "\n";
    }

} // end object class Fighter
