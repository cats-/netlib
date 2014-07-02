package netlib.server.handler;

import netlib.core.data.Data;
import netlib.core.data.handler.DataHandler;
import netlib.server.Server;
import netlib.server.connection.Connection;

public interface ServerDataHandler extends DataHandler{

    public void handle(final Server server, final Connection connection, final Data data);
}
