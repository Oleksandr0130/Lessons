package lessons_22.HomeWork;

public class AmateurAthlete extends Human{
    private int run;
    private int rest;

    public AmateurAthlete(int run, int rest, int run1, int rest1) {
        super(run, rest);
        this.run = run1;
        this.rest = rest1;
    }

    @Override
    public void run() {
        System.out.println("Спортсмен-любитель бежит: " + run + " km");
    }

    @Override
    public void rest() {
        System.out.println("спортсмену-любителю нужен отдых: " + rest + "km");
    }
}
