package lessons_16;

public class Dog {

    String name;

    int weight;


    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    void  eat(){
        System.out.println("I'm eating");
        weight++;
    }

    void run(){
        //Проверяем - позволяет ли вес бегать сейчас
        // если нет - отправить поесть
        // После еды проверить пункт 1
        //цикл
        while (weight < 3){
            System.out.println(" Сорри я голодная бежать не могу");
            System.out.println(" Мой вес: " + weight + ". Надо поесть!");
            eat();
        }

        System.out.println("I'm runing");
        weight -= 2;
    }

    String whoAmI(){
        return "I am dog: " + this.name + " my weight: " + weight;
    }
}
