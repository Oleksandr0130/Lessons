package lessons_30.HomeWork;

public class SeasonMain {
    public static void main(String[] args) {
        System.out.println("Весна: " + Season.SPRING.getAverageTemperature());
        System.out.println("Лето: " + Season.SUMMER.getAverageTemperature());
        System.out.println("Осень: "+ Season.AUTUMN.getAverageTemperature());
        System.out.println("Зима: " + Season.WINTER.getAverageTemperature());

        for (Season season : Season.values()){
            System.out.println(season.toString());
        }


    }
}
