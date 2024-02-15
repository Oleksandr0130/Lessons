package lessons_22;

import java.io.StringBufferInputStream;

public class Hamster extends  Animal{

    @Override
    public void voice() {
        System.out.println("Hamster say Hrum-Hrum");
    }

    public void voice(String string){
        System.out.println("Hamster say: " + string);
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}
