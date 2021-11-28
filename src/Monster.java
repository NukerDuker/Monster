public class Monster {
    private String name;
    private int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void growl (String growl){
        System.out.println(growl);
    }

    public void attack () {
        System.out.println(damage);
    }
}
