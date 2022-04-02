import java.util.ArrayList;
import java.util.List;

public class ProxyServer implements GameServer
{
    private GameServer server = new ServiceServer();
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("albion");
        bannedSites.add("europa");
        bannedSites.add("china");
        bannedSites.add("russia");
    }

    @Override
    public void connectTo(String serverName)
    {
        if(bannedSites.contains(serverName.toLowerCase()))
        {
            System.out.println("Access Denied to " + serverName);
            return;
        }

        server.connectTo(serverName);
    }

}
