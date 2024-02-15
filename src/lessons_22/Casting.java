package lessons_22;

public class Casting {

    // Восходящее (Upcasting) и нисходящее (Downcasting) преобразование
    public static void main(String[] args) {

        Animal animal = new Hamster();// здесь тип Hamster автоматически преобразуется к типу Animal
        Animal animal1 = new Dog();// восходящее преобразование обычно происходит не явно
        Animal animal2 = new Cat();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) { // Проверяем тип обьекта
                System.out.println(animals[i] + " может быть Downcasting к Cat");
                Cat catTest = (Cat) animals[i];
                catTest.eat();
            }else{
                System.out.println(animals[i] + " Не может быть Downcasting к Cat");
            }
            System.out.println(animals[i]);
            animals[i].voice();


            System.out.println("======================");
        }

        System.out.println("=========Downcasting=============");
        Cat cat1 = (Cat) animal2;
        cat1.voice();
        cat1.eat();

        System.out.println("==============SuperCat=============");

        Animal animalSuper = new SuperCat();

        if (animalSuper instanceof Cat) {
            Cat cat2 = (Cat) animalSuper;
            cat2.eat();
        }
        if (animalSuper instanceof SuperCat) {
            SuperCat superCat = (SuperCat) animalSuper;
            superCat.superVoice();
        }
    }
}
