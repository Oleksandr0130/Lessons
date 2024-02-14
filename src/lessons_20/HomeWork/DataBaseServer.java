package lessons_20.HomeWork;

public class DataBaseServer extends Server {
    private String databaseType;

    public DataBaseServer(String name, int capacity, String databaseType) {
        super(name, capacity);
        this.databaseType = databaseType;
    }

    public String info(){
        StringBuilder sb = new StringBuilder(super.info());
        sb.append(", DataBase Type: ").append(databaseType);
        return sb.toString();
    }
}
