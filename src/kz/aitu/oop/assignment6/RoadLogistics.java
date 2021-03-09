package kz.aitu.oop.assignment6;

public class RoadLogistics implements Logistic  {
    @Override
    public Transport createTransport() {
        return new Truck();
    }

    @Override
    public Transport planDelivery() {
        return null;
    }
}
