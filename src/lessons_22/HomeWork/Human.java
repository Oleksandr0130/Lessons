package lessons_22.HomeWork;

public class Human {
    private int run;
    private int rest;

    public Human(int run, int rest) {
        this.run = run;
        this.rest = rest;
    }
    public void run(){
        System.out.println("Человек бежит: " + run + " km");
    }
    public void rest(){
        System.out.println("Человеку нужен отдых: " + rest + " минут");
    }
}
