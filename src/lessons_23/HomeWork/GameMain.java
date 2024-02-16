package lessons_23.HomeWork;

public class GameMain {
    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior("Warrior", 100, 10);
        characters[1] = new Mage("Mage", 50, 7);
        characters[2] = new Archer("Archer", 75, 15);

        for (GameCharacter gameCharacter : characters){
            System.out.println(gameCharacter.toString());
            gameCharacter.attack();
            System.out.println("________________________________");
        }
    }
}
