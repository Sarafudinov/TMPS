public class MainClient {

    public static void main(String[] args) {
        GameServer server = new ProxyServer();
        System.out.println("");
        server.connectTo("Greed Server");
        server.connectTo("Albion");
    }

}
