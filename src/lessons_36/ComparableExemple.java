package lessons_36;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableExemple {
    public static void main(String[] args) {
        int[]ints = {9,5,1,4,2,7,6,0};
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[5];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("Bentley", 2023, 300);
        cars[4] = new Car("Ferrary", 2021, 300);

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));


        System.out.println("\n=====================================");

        CarSpeedComparator speedComparator = new CarSpeedComparator();
        Arrays.sort(cars,speedComparator);

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));

        System.out.println("==============================================");

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getMaxSpeed() - car2.getMaxSpeed() ;
            }
        });
        System.out.println(Arrays.toString(cars));

        // функциональный интерфейс

        System.out.println("=====функциональный интерфейс=====");
        Arrays.sort(cars, (car1 , car2)-> car1.getMaxSpeed() - car2.getMaxSpeed());
        System.out.println(Arrays.toString(cars));


        Arrays.sort(cars,(car1, car2)->{
            int yearCompare = car1.getYear() - car2.getYear();
        //    int yearCompare = Integer.compare(car1.getYear(),car2.getYear());

            if (yearCompare != 0){
                return yearCompare;
            }else {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));


    }
}
