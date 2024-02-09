package lessons_18.HomeWork;

import static lessons_18.HomeWork.Dog.setMaxJumpHeight;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Zeus", 30);

        setMaxJumpHeight(Dog.getMaxJumpHeight() * 2);

        System.out.println("Имя собаки: " + dog.getName());
        System.out.println("Изначальноя высота прыжка: " + dog.getHeight());

        dog.Jump();


        dog.training();
        dog.training();


    }
}
