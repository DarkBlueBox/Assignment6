package kz.aitu.oop.assignment6;

public class Main {
    public static void main(String[] args) {
        Logistic L=createLogisticByTransport("Truck");
        Transport T=L.createTransport();
        T.deliver();
    }
    public static Logistic createLogisticByTransport(String transport) {

        if (transport.equalsIgnoreCase("Truck")) {
            return new RoadLogistics();
        } else if (transport.equalsIgnoreCase("Ship")) {
            return new SeaLogistics();
        } else {
            throw new RuntimeException(transport+" unknown transport");

        }
        }
    }
