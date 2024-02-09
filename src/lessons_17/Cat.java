package lessons_17;

public class Cat {
    private String test;

    public String name;

    int age;

    protected int weight;

    public Cat(String test, String name, int age, int weight) {

        this.test = test;
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public void sayMeu() {
        System.out.println("MIay" + name);
    }

    // геттеры
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    // Сеттеры
    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("некоректное значение возраста");
        } else {
            this.age = age;
        }

    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}