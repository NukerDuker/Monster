public class Monster {

    private String name;
    private int damage;

    Monster() {
        this("Dragon", 100);
    }

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.printf("Monster %s was created!\n", this.name);
    }

    public void growl() {
        System.out.printf(" %s growled\n", name);
    }

    public void attack() {
        System.out.printf("Monster %s attacked with damage %d \n", name, damage);
    }
}
