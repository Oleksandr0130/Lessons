package lessons_20.HomeWork;

public class mainDBSSW {
    public static void main(String[] args) {
        Server server = new Server("all.server",1000);
        System.out.println(server.info());

        WebServer webServer = new WebServer("ServMarkt", 1500,"Virtual Hosting" );
        System.out.println(webServer.info());

        DataBaseServer dataBaseServer = new DataBaseServer("Microsoft", 10000,"Microsoft .NET Framework");
        System.out.println(dataBaseServer.info());
    }

}
