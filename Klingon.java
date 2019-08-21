public class Klingon extends Enemy
{
    // Instance Variables
    boolean isFriendly = false;

    // Constructor
    public Klingon(String name, String weapon, int lives, int health, boolean isFriendly)
    {
        super(name, weapon, lives, health);
        this.isFriendly = isFriendly;
    }

    // Setters & Getters
    public void setIsFriendly(boolean friendly)
    {
        isFriendly = friendly;
    }
    public boolean getIsFriendly()
    {
        return isFriendly;
    }

    // Brain Methods
    @Override
    public void Attack(int damage)
    {
        if (isFriendly)
        {
            System.out.println("Ouch! I thought we were friends!");
            isFriendly = false;
        }
        else
        {
            health -= damage;
        }
    }

    // toString
    @Override
    public String toString()
    {
        return "~Klingon~\n" + super.toString() + " | isFriendly: " + isFriendly + "\n";
    }
}
