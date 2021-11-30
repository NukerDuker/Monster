import java.util.Locale;

public class Zombie extends Monster {

    private static String growl = "Raaaauuughhhh";

    public Zombie (String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl() {
        System.out.print(growl);
        super.growl();
    }

    public void growl(boolean loud) {
        if (loud) {
            System.out.print(growl.toUpperCase());
            super.growl();
        } else {
            this.growl();
        }
    }

    @Override
    public void attack () {
        super.attack();
        this.growl();
    }
}