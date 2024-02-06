package lessons_15.HomeWork;
public class CvMain {
    public static void main(String[] args) {
        Cv cv = new Cv("Student", 20, "learning");

        cv.result();

        System.out.println("==========================");

        Cv cv1 = new Cv("Teacher", 40, "teach");

        cv1.result();

        System.out.println("===========================");

        Cv cv2 = new Cv("Doctor", 35, "do operation");

        cv2.result();
    }

}
