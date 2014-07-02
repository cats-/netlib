package netlib.client.event;

import netlib.client.Client;

public interface ClientListener {

    public void onStart(final Client client);

    public void onFinish(final Client client);
}
