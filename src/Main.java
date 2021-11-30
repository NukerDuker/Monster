public class Main {
    public static void main(String[] args) {
       /* Zombie zombie1 = new Zombie("Alice");
        zombie1.attack();
        zombie1.growl();
        Zombie zombie2 = new Zombie("Bob");
        zombie2.attack();
        zombie2.growl();*/

        Zombie zombie = new Zombie("Alice");
        zombie.growl();
        zombie.growl(true);
        zombie.growl(false);
    }
}
