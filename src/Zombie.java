public class Zombie extends Monster {

    private String growl;

    public Zombie (String name) {
        super(name, 5);
        this.growl = "Raaaauuughhhh";
    }

    public void growl() {
        System.out.println(growl);
    }
}
