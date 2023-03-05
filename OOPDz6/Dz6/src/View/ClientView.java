package View;

import Controller.TransportController;
import Model.Bicycle;
import Model.Moped;
import Model.Transport;
import Service.ParkTransportImpl;

public class ClientView {
    public static void main(String[] args) {
        Moped moped = new Moped();
        Bicycle bicycle = new Bicycle();

        TransportController<Moped> transportController = new TransportController<Moped>();
        transportController.saveTransport(moped,234);
        transportController.getTransport();

        TransportController<Bicycle> transportController1 = new TransportController<Bicycle>();
        transportController1.saveTransport(bicycle,234);
        transportController1.getTransport();
    }
}
