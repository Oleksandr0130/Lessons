package lessons_23.HomeWork;

public class Mage extends GameCharacter{
    public Mage(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack() {
        System.out.println("маг использует магические заклинания!!");
    }
}
