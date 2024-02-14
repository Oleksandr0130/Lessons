package lessons_20.HomeWork;

public class Server {
    private String name;
    private int capacity;

    public Server(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }


    public String info (){
        StringBuilder sb = new StringBuilder();
            sb.append("Server Name: ").append(name).append("| Capacity: ").append(capacity).append(" GB");
            return sb.toString();
        }
    }

