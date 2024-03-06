package lessons_36;


import java.util.Comparator;

//Имплементация компоратор позволяет сравнить два объекта
public class CarSpeedComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getMaxSpeed() - car2.getMaxSpeed();
    }
}
