package lessons_18.HomeWork;


/*
Написать класс Собака.

Каждая Собака обязательно должна иметь имя и высоту прыжка

Должна уметь прыгать и должна уметь тренироваться.

За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров

Максимальная высота прыжка, которую может натренировать собака, не может быть больше, чем двукратная высота первоначального прыжка.

Также должен быть метод взять барьер.
В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер
 */
public class Dog {

    private String name;

    private int height;

    private int maxJumpHeight = Integer.MAX_VALUE;



    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }


    public  int getMaxJumpHeight(){
        return maxJumpHeight;
    }


    public void setMaxJumpHeight(int maxJumpHeight){
        this.maxJumpHeight = maxJumpHeight;
    }

    public void Jump() {
        System.out.println(name + " прыгает на высоту " + height + " см.");

    }

    void training() {
        int newJump = height + 10;

        if (newJump <= maxJumpHeight) {
            height = newJump;
            System.out.println("Тренирована! Новая высота прыжка: " + height + " см.");
        } else {
            System.out.println(name + " Выше не прыгну!!!");
        }

    }

    public void jumpOverBarrier(int barrierHeight) {
        if (barrierHeight <= maxJumpHeight) {
            System.out.println(name + " прыгает через барьер высотой " + barrierHeight + " см.");
        } else {
            System.out.println(name + " не в состоянии прыгнуть через такой высокий барьер.");
            if (barrierHeight <= (maxJumpHeight + 10)) {
                System.out.println(name + " может преодолеть барьер после тренировки.");
                training();
                jumpOverBarrier(barrierHeight);
            }
        }
    }

}

