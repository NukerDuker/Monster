public class Monster {

    private String name;
    private int damage;

    Monster () {
        this("Dragon", 100);
    }
    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.printf("%s was succesfully created!", this.name);
    }

    public void growl(String growl) {
        System.out.println(growl);
    }

    public void attack() {
        System.out.println(damage);
    }
}
