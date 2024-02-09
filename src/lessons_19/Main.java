package lessons_19;

public class Main {
    public static void main(String[] args) {
        FinalDemo finalDemo=new FinalDemo(15);

        finalDemo.printArray();

        finalDemo.setNewValue();
        finalDemo.printArray();

        System.out.println(FinalDemo.PI);

        FinalDemo.INTS[0]=150;
    }
}
