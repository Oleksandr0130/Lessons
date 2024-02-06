package lessons_15;


/*
Имя , цвет , возраст
мяукать, спать, бежать
 */
public class Cat {
    String name;

    String color;

    int age;

    public Cat(){ // вид конструктора по умолчанию
        System.out.println("Конструктор 1");

    }

    //Перегруженный(ПЕРЕПИСАННЫЙ) конструктор
    public  Cat(String catName){
        System.out.println("Конструктор 2");
        name = catName;
    }

    public void whoAmI(){
        System.out.println("Я котик: " + name + ", мой возраст: " + age + " ,цвет: " + color);
    }
    void sleep () {
        System.out.println("Я сплю");
    }
        void sayMiau () {
            System.out.println("Мяу");
        }
            void run () {
                System.out.println("Я побежал");
            }
        }



