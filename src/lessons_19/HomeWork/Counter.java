package lessons_19.HomeWork;

//Класс "Счётчик" Разработайте класс Counter,
// позволяет создавать объекты-счётчики с возможностью увеличения и уменьшения значения счётчика.

//В классе должны быть:
//Поле value для хранения текущего значения счётчика.
//Методы increment() и decrement(), увеличивающие и уменьшающие значение счётчика соответственно.
//Метод getValue() для получения текущего значения счётчика.

public class Counter {
    private int value;

    public Counter(int initValue){
        this.value = initValue;
    }

    public void increment(){
        value++;
    }

    public void decrement(){
        value--;
    }

    public int getValue(){
        return value;
    }

    public static void main(String[] args) {
        Counter counter = new Counter(0);

        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        counter.decrement();
        counter.decrement();
        counter.decrement();


        int currentValue = counter.getValue();
        System.out.println("Значение Счетчика = " + currentValue);
    }
}
