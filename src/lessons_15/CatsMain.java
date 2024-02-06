package lessons_15;


//Значения по умолчанию для полей
// ссылочные типы данных - null
// числовые примитивы - 0 (0.0) - double
//boolean - false
public class CatsMain {
    public static void main(String[] args) {
        Cat cat = new Cat(); // создаем обьект класса Cat
        //Cat() - вызов конструктора класса

        cat.sayMiau();
        cat.run();
        cat.sleep();

        // при создании обьекта класса все его поля инициализируются значениями по умолчанию
        // за инициализацию отвечает конструктор

String catNameVar = cat.name;
        System.out.println("Имя кота: " + catNameVar);
        System.out.println("Возраст " + cat.age);
        System.out.println("Цвет" + cat.color);

        System.out.println("===================================");

        // Создаем еще один оьект класса Cat

        Cat cat1 = new Cat("Max");

        cat1.run();
        cat1.sleep();
        System.out.println("имя cat1: " + cat1.name);
        System.out.println("Возраст cat1: "+ cat1.age);

        System.out.println("имя первого кота " + cat.name);

        System.out.println("========================================");

        cat.whoAmI();
        cat1.whoAmI();
    }
}
