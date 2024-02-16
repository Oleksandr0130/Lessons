package lessons_23.HomeWork;

public class Archer extends GameCharacter {
    public Archer(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack() {
        System.out.println("Лучник атакует");
    }
}
