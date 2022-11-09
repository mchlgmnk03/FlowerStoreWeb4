package ua.edu.ucu.apps.FlowerStoreWeb.Payment;

import lombok.Getter;

@Getter
public class CreditCard implements Payment {
    private final String name = "Credit Card";
    private final String description = "Payment with Card";

    public void pay(double price) {
        System.out.println("Payment is successful");
    }
}
