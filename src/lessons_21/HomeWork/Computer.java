package lessons_21.HomeWork;

public class Computer {
    private String model;

    private Processor processor;

    private Memory memory;

    private Storage storage;

    public Computer(String model) {
        this.model = model;
        processor = new Processor("AMD", "Ryzen-7", 2500);
        memory = new Memory("Samsung", "Evo-Pro", 16000);
        storage = new Storage("WD", "Baracuda", 1000);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
                sb.append("Computer : ");
        sb.append("processor: ").append(processor.getModel()).append("; ");
        sb.append(".");

        return  sb.toString();
    }

    public static void main(String[] args) {
        Computer computer = new Computer("ROG");

        }
    }

