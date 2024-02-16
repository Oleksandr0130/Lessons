package lessons_23.HomeWork;


//Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
//
//Определите абстрактный метод attack(), который будет различаться для разных типов персонажей (например, воин атакует мечом, а маг использует магические заклинания).
//
//Создайте несколько конкретных подклассов, представляющих разные типы персонажей, такие как Warrior, Mage, Archer, и т. д.
//
//Переопределите метод attack() для каждого класса.
//
//Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.
abstract public class GameCharacter {
     String name;
     int health;
     int level;

    public GameCharacter(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    abstract public void attack();

    @Override
    public String toString() {
        return "GameCharacter {" +
                "name = '" + name + '\'' +
                ", health = " + health +
                ", level = " + level +
                '}';
    }

}
