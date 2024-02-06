package lessons_15.HomeWork;

public class Cv {

    String profession;

    int age;

    String canMake;

    public Cv (String profession, int age, String canMake){
        this.profession = profession;
        this.age = age;
        this.canMake = canMake;
    }

        public void Student(){
            System.out.println("Profession: " + profession + "\n" + "Mi age is: " + age + "\n" + "I'm " + canMake);
    };

}
