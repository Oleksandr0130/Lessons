package lessons_30.HomeWork;


import java.util.Arrays;

//Реализуйте Enum для определения четырех времен года с методами,
// возвращающими среднюю температуру для каждого времени года.
public enum Season {
    SPRING("Весна", 13.0, 18.0, 20.0),
    SUMMER("Лето", 15.0, 22.5, 30.0),
    AUTUMN("Осень", 10.0, 12.0, 15.0),
    WINTER("Зима", -5.0, - 10.0, -15.0);

    private final String season;

    private double[] averageTemperature;

    Season(String season, double... averageTemperature) {
        this.season = season;
        this.averageTemperature = averageTemperature;
    }

    public String getSeason() {
        return season;
    }

    public double getAverageTemperature() {
        double sum = 0.0;
        for (double temperature : this.averageTemperature){
            sum += temperature;
        }

        return sum / this.averageTemperature.length;
    }

    @Override
    public String toString() {
        return String.format("Season{season = '%s', averageTemperature = '%.1f'}",season,getAverageTemperature());
    }
}
