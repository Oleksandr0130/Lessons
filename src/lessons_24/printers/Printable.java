package lessons_24.printers;

public interface Printable {
// Константа по умолчанию : public static final
    int POWER = 220;


    //интерфейс абстрактный косвенно.
    //каждый метод в интерфейсе косвенно абстракный и публичный
    // нам не нужно писать public abstract, эти модификаторы уже есть по умолчанию у каждого метода интерфейса
    void print();

    void print(int number);

    //Методы по умолчанию (С JDK 8)
    default void sayHello(String string){
        System.out.println("Hello, " + string + ", " + POWER);
        privateMethod();
    }

    // С JDK 8 доступны статические методы

    static void staticMethod (){
        System.out.println("Iam static");
        //доступен только статический контент
    }

    private static void staticPrivateMethod(){
        System.out.println("Iam staticPrivate");
    }

    // c JDK 9 мы можем определять private методы
    private void privateMethod (){
        System.out.println("Iam privat");
    }
}
