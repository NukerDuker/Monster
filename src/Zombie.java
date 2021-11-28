public class Zombie extends Monster {

    private String growl;

    public Zombie (String name) {
        super(name + " the Zombie", 5);
        this.growl = "Raaaauuughhhh";
    }

    public void growl() {
        System.out.print(growl);
        super.growl();
    }

    public void attack () {
        super.attack();
    }
}