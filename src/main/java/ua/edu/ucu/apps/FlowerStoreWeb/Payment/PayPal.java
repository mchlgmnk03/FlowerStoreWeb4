package ua.edu.ucu.apps.FlowerStoreWeb.Payment;

import lombok.Getter;

@Getter
public class PayPal implements Payment {
    private final String name = "PayPal";
    private final String description = "Payment with PayPal";

    public void pay(double price) {
        System.out.println("Payment is successful");
    }
}
