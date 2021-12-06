public abstract class Monster extends Entity {
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        super(name + "The Monster");
        this.force = force;

    }

    protected int getForce(){
        return force;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    abstract public void attack(Entity entity);
}