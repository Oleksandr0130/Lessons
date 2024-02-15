package lessons_22.HomeWork;

public class ProfessionalAthlete extends AmateurAthlete{
    public void run(){
        System.out.println("Спортсмен-профи бежит со скоростью 25 км");
        rest(5);
    }
    public void rest(int minut){
        System.out.println("Нужен Отдых: " + minut + "минут");
    }
}
