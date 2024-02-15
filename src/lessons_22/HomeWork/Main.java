package lessons_22.HomeWork;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.run();
        System.out.println("==========================");

        AmateurAthlete amateurAthlete = new AmateurAthlete();
        amateurAthlete.run();
        System.out.println("==========================");

        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete();
        professionalAthlete.run();
    }

}
