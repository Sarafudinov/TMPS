public class ServiceServer implements GameServer {

        @Override
        public void connectTo(String serverName)
        {
            System.out.println("Connecting to "+ serverName);
        }

}
