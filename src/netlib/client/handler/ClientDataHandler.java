package netlib.client.handler;

import netlib.client.Client;
import netlib.core.data.Data;
import netlib.core.data.handler.DataHandler;

public interface ClientDataHandler extends DataHandler{

    public void handle(final Client client, final Data data);

}
