package netlib.server.event;

import netlib.server.Server;
import netlib.server.connection.Connection;

public interface ServerListener {

    public void onStart(final Server server);

    public void onFinish(final Server server);

    public void onJoin(final Server server, final Connection con);

    public void onLeave(final Server server, final Connection con);
}
