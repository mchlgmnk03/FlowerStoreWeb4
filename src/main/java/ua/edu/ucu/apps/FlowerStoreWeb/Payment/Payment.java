package ua.edu.ucu.apps.FlowerStoreWeb.Payment;

public interface Payment {
    String getName();

    String getDescription();

    void pay(double price);
}
