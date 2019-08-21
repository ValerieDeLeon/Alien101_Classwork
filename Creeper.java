public class Creeper extends Enemy
{
    boolean isAgressive = true;

    public Creeper(String name, String weapon, int lives, int health, Boolean isAgressive)
    {
        super(name, weapon, lives, health);
        this.isAgressive = isAgressive;
    } // end full constructor with call to super

    @Override
    public void Attack(int damage)
    {
        if(isAgressive)
            health -= damage;
        else
            System.out.println("Your cat saved you.");
    } // end method Attack

    @Override
    public String toString()
    {
        return "~Creeper~\n" + super.toString() + " | isAgressive: " + isAgressive + "\n";
    }
}
