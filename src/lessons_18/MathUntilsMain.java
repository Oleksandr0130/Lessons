package lessons_18;

public class MathUntilsMain {
    public static void main(String[] args) {
        int sum = MathUntils.sumOfints(1, 4,5,6);
        System.out.println("sum: " + sum);

        Car car = new Car("Test", 100);
        Car car1 = new Car("Car",200);

        car.info();
        System.out.println(Car.getCountCar());

        /*
        1. Не статические методы могут обращаться к нестатическим полям и методам
        2. не статические методы могут обращаться к статическим полям и методам
        3. Статические методы могут к статическим полям и методам
        4. Статические методы НЕ могут к НЕ статическим полям и методам
         */
        }
    }

