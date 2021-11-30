public class Battle {

    Monster[] squad;
    int count;

    public Battle() {
        squad = new Monster[5];
        count = 0;
    }

    public void add(Monster monster) {
        if (monster != null) {
            if (count < 5) {
                squad[count++] = monster;
            } else {
                System.out.println("No more monsters!");
            }
        }
    }

    private void run() {
        for (Monster monster:
             squad) {
            if (monster != null) {
                monster.attack();
            }
        }
    }

    public void start() {
        if (count > 0) run();
    }
}
