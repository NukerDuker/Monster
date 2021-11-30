public class Main {
    public static void main(String[] args) {
       /* Zombie zombie1 = new Zombie("Alice");
        zombie1.attack();
        zombie1.growl();
        Zombie zombie2 = new Zombie("Bob");
        zombie2.attack();
        zombie2.growl();*/

       /* Zombie zombie = new Zombie("Alice");
        zombie.growl();
        zombie.growl(true);
        zombie.growl(false);*/

        Battle battle = new Battle();
        /*battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));
        battle.add(new Zombie("Noname"));*/
        battle.add(null);
        battle.start();
    }
}
