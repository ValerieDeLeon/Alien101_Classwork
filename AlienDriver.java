public class AlienDriver
{
    public static void main(String[] args)
    {
        Fighter joe = new Fighter("Captain", "Joe", "Spork", 28, 1000, 150);
        Enemy generic = new Enemy("Generic", "Floon", 356, 5);
        Creeper creepie = new Creeper("Creepie", "TNT", 1, 20,true);
        Klingon worf = new Klingon("Worf", "Phaser", 1, 1000, true);
        Klingon burtog = new Klingon("Burtog", "Bat'leth", 1, 1000, false);

        Actor[] cast = {creepie, worf, burtog};
        for (Actor i : cast)
        {
            System.out.println(i);
        }

        int[] numArr = {5, 6, 7, 8, 2, 23};
//        for (int i : numArr)
//        {
//            System.out.println(i);
//        }

        System.out.println(joe);
        System.out.println("Player Health: " + joe.getHealth() + "\n");
        // System.out.println(generic);
        //System.out.println(creepie);
        creepie.setWeapon("Charged TNT");
        System.out.println(creepie);
        // System.out.println(worf);
        // System.out.println(burtog);

        creepie.Attack(10);
        System.out.println(creepie);

    } // end main method
}
