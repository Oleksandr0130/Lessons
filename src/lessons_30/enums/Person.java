package lessons_30.enums;

public class Person {
    private String name;

    private  int age;

    private Day dayOfBirth;

    public Person(String name, int age, Day dayOfBirth) {
        this.name = name;
        this.age = age;
        this.dayOfBirth = dayOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Day getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Day dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }
}
