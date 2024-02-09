package lessons_17;

public class ArrayTest {
    public static void main(String[] args) {

        ra rar = new ra();

        rar.add(10,15,-6,-41,-16, 7 ,99,0,15);

        System.out.println(rar.toString());

        System.out.println("size " + rar.size());

        System.out.println(rar.get(8));

        int [] ints = {10, 56,-53, 0 , 1, 77,43};
        ra RA = new ra(ints);

        System.out.println("arrayArray from array" + RA.toString());

        System.out.println(RA.indexOf(-53));
        System.out.println(RA.indexOf(10000));

        System.out.println(RA.remove(2));
        System.out.println(RA.toString());

        RA.showCursor();

        RA.add(100);
        System.out.println(RA.toString());

        RA.removeByValue(100);
        System.out.println(RA.toString());

        System.out.println(RA.removeByValue(1000));
    }
}
