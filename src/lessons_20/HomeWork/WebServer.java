package lessons_20.HomeWork;

public class WebServer extends Server{
    private String hostingProvider;

    public WebServer(String name, int capacity, String hostingProvider) {
        super(name, capacity);
        this.hostingProvider = hostingProvider;
    }

    public String getHostingProvider() {
        return hostingProvider;
    }

    public String info(){
        StringBuilder sb = new StringBuilder(super.info());
        sb.append(", Hosting Provider: ").append(hostingProvider);
        return sb.toString();

    }

}
