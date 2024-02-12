package lessons_19.HomeWork;



// Задание: Создайте класс Product
//
//Основные требования:
//
//Класс должен содержать приватные поля: static long counterId для подсчета и автоматического присвоения уникального идентификатора каждому создаваемому объекту,
// final long id для хранения уникального идентификатора конкретного объекта,
// String name для названия продукта и double price для хранения его цены.
//Реализуйте конструктор, который принимает название и цену продукта.
// Внутри конструктора уникальный id должен автоматически присваиваться продукту, используя counterId для подсчета идентификаторов.
//Добавьте геттеры и сеттеры для полей name и price.
//Создайте метод info(), который возвращает строку с информацией о продукте, включая его id, название и цену.
public class Product {

    private static long counterId;

    private final long id;

    public String name;

    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = counterId++;
    }

    public String info(){
        return  "id: " + id + "|" + name + "--price--"  + String.format("%.2f", price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }
    public long getId (){
        return  counterId;
    }

    private boolean precentTrueFalse(double percent){
        return  percent >= -100 && percent <= 100;
    }

    public void changePercent( double percent){
        if (precentTrueFalse(percent)){
            this.price *= (1+ percent / 100);
        }else {
            System.out.println("Такой процент не сушествует!!!!");
        }
    }




    public static void main(String[] args) {

        Product product = new Product("Volvo", 25599);
        Product product1 = new Product("Panamera", 10000000);

        System.out.println(product.info());
        System.out.println(product1.info());

        System.out.println("Всего продуктов: " + counterId);

        product1.changePercent(-150);
        System.out.println("===========================");
        System.out.println(product.info());
        System.out.println(product1.info());
    }
}
