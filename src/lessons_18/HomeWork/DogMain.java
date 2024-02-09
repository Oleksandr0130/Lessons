package lessons_18.HomeWork;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Zeus", 30);

        dog.setMaxJumpHeight(dog.getHeight() * 2);

        System.out.println("Имя собаки: " + dog.getName());
        System.out.println("Изначальноя высота прыжка: " + dog.getHeight());

        dog.Jump();


        dog.training();
        dog.training();
        dog.training();
        dog.training();


    }
}
