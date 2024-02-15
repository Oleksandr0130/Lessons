package lessons_22.HomeWork;

public class AmateurAthlete extends Human{

    @Override
    public void run() {
        System.out.println("Спортсмен-любитель бежит со скоростью 15 km");
        super.rest(10);

    }
    @Override
    public void rest(int minut) {
        System.out.println("Нужен Отдых" + minut + "минут");
    }
}
