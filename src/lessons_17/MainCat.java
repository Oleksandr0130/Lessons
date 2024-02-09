package lessons_17;

public class MainCat {

    public static void main(String[] args) {
        Cat cat = new Cat("Test", "Name", 10, 20);

        cat.sayMeu();

        String catName = cat.getName();

        int catAge = cat.getAge();
        System.out.println(catName + ":" + catAge);

        cat.setAge(-15);

        System.out.println(cat.getAge());

        cat.setName(null);
        System.out.println("cat.getName(): " + cat.getName());
    }
}
