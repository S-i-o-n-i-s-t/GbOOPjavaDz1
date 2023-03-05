package Controller;

import Model.Moped;
import Model.Transport;
import Service.ParkTransport;
import Service.ParkTransportImpl;

public class TransportController<T extends Transport>{
    private ParkTransport parkTransport = new ParkTransportImpl();

    public void saveTransport(T transport,int num){
        parkTransport.saveTransport(transport.numTransport(num));
    }
    public void getTransport(){
        parkTransport.getTransport();
    }
}
