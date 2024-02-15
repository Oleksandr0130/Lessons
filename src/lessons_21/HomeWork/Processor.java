package lessons_21.HomeWork;

public class Processor extends Component{
    private int tactSpeed;

    public Processor(String brand, String model, int tactSpeed) {
        super(brand, model);
        this.tactSpeed = tactSpeed;
    }
}
