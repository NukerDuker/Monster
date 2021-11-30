public class Battle {

    Monster[] squad = new Monster[5];
    int count;

    public Battle() {
        count = 0;
    }

    public void add(Monster monster) {
        if (count < 5) {
            squad[count] = monster;
            count++;
        } else {
            System.out.println("No more monsters!");
        }
    }

    private void run() {
        for (Monster monster:
             squad) {
            monster.attack();
        }
    }

    public void start() {
        this.run();
    }
}
