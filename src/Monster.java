public abstract class Monster {

    private String name;
    private int damage;
    int hp;
    int force;

    Monster() {
        this("Name " + "The Zombie ", 5);
    }

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    abstract public void attack(Monster monster);

    protected boolean damage(int dhp){
        hp -= dhp;
        return hp <= 0;
    }

    protected boolean isDestroyed() {
        return hp <= 0;
    }

    public void growl() {
        System.out.printf(" %s growled\n", name);
    }

    public void attack() {
        System.out.printf("Monster %s attacked with damage %d \n", name, damage);
    }
}
