package lessons_22.HomeWork;

public class Human {
    public void run() {
        System.out.println("человек бежит со скоростью 10 км");
        rest(15);
    }
    public void rest(int minut){
        System.out.println("отдых после пробежки: " + minut +" минут");
    }

}
