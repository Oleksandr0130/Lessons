package lessons_22.HomeWork;

public class ProfessionalAthlete extends AmateurAthlete{
    public int run;
    public int rest;

    public ProfessionalAthlete(int run, int rest, int run1, int rest1, int run2, int rest2) {
        super(run, rest, run1, rest1);
        this.run = run2;
        this.rest = rest2;
    }

    @Override
    public String toString() {
        return "Спортсмен-профи бежит: " + run + "\n" + "Спортсмену-профи нужен отдых: " + rest;
    }
}
