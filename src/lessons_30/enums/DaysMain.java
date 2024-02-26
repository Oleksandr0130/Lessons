package lessons_30.enums;

public class DaysMain {
    public static void main(String[] args) {
    Person person = new Person("John", 31, Day.MONDAY);

        System.out.println(person);

        person.setDayOfBirth(Day.SATURDAY);

        String dayStr = person.getDayOfBirth().toString();
        System.out.println(dayStr);

        System.out.println("================================");

        //получение массива значения Enum
        Day[] days = Day.values();

        for (Day day : Day.values()){
            System.out.println(day);
        }

        System.out.println("================================");

        Day enumMunday = Day.valueOf("MONDAY");
        System.out.println(enumMunday);

        // Сравнение Enum - для сравнения двух значений Enum
        // безопасно и допустимо использовать ==

        System.out.println(enumMunday == Day.THURSDAY);

        switch (person.getDayOfBirth()){
            case FRIDAY:
                System.out.println("Пятница");
                break;
            case MONDAY:
                System.out.println("Понедельник");
                break;
            case WENDESDAY:
                System.out.println("Среда");
            case SATURDAY:
                System.out.println("Суббота");
                break;
            default:
                System.out.println("Какой-то другой день недели");
        }


        // порядковый номер
        System.out.println(Day.SUNDAY.ordinal());
        System.out.println(enumMunday.ordinal());

        System.out.println(enumMunday.getRussian());
        enumMunday.setRussian("Пн");
        System.out.println(enumMunday.getRussian());

        System.out.println("=========================");
        System.out.println(enumMunday.getDayOfWeek());
    }

}
