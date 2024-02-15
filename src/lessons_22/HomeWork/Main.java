package lessons_22.HomeWork;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(10,15);
        human.run();
        human.rest();
        System.out.println("==========================");

        AmateurAthlete amateurAthlete = new AmateurAthlete(10,15, 15,10);
        amateurAthlete.run();
        amateurAthlete.rest();
        System.out.println("==========================");

        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete(10,15,15,10,25, 5);
        System.out.println(professionalAthlete.toString());


    }

}
