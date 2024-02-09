package lessons_18;

public class Car {

    private static int countCar;
    private String model;

    private  int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        countCar++;
    }

    public void info (){
        System.out.println("Car: " + this.model + " | power" + this.powerPS + " | count: " + countCar);
    }

    public static int getCountCar(){
        return countCar;
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 200);
        car.info();

        Car car1 = new Car("VW", 250);
        car1.info();

        Car car2 = new Car("FORD", 75);
        car2.info();


        System.out.println("Создано всего авто: " + Car.countCar);
    }


}
