package kz.aitu.oop.assignment6;

public interface Logistic {
    public Transport createTransport();
    public default Transport planDelivery() {
        Transport t =createTransport();
        return t;
    }

}
