package netlib.client.handler;

import netlib.client.Client;
import netlib.core.data.Data;
import netlib.core.data.handler.DataHandler;

public interface ClientDataHandler<T extends Client> extends DataHandler{

    public void handle(final T client, final Data data);

}
