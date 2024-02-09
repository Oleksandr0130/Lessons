package lessons_19.HomeWork;


public class JumpDog {
    public static void main(String[] args) {

        Dog dog = new Dog("Jumper", 50);

        dog.info();


        System.out.println("dog.takeBarrier(30): " + dog.takeBarrier(30));
        System.out.println("dog.takeBarrier(70): " + dog.takeBarrier(70));
        System.out.println("dog.takeBarrier(120): " + dog.takeBarrier(120));

        System.out.println(" \n ============================= \n");

        Dog dog1 = new Dog("Bim", 44); // 54, 64, 74, 84 == 88
        System.out.println(dog1.takeBarrier(85));

        System.out.println("Сделанное кол-во прыжков всеми собаками: " + Dog.getTotalJumps());


    }
}

