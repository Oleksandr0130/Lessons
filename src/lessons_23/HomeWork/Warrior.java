package lessons_23.HomeWork;

public class Warrior extends GameCharacter {
    public Warrior(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack() {
        System.out.println("воин атакует мечом!");
    }
}
