abstract class Entity{

    private String name;
    private int hp = 15;
    private boolean destroyed = false;

    public Entity(String name) {
        this.name = name;
        System.out.println("Creature " + name + " was created");
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Creature " + name + " was destroyed");
            return true;
        }
        return false;
    }
}