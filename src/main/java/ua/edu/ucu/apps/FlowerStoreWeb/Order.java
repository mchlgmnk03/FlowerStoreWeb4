package ua.edu.ucu.apps.FlowerStoreWeb;

import ua.edu.ucu.apps.FlowerStoreWeb.Delivery.Delivery;
import ua.edu.ucu.apps.FlowerStoreWeb.Payment.Payment;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.FlowerPack;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setPaymentDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0.0;
        for (Item pack : items) {
            price += pack.getPrice();
        }
        return price;
    }

    public void processOrder() {
        System.out.println("The contents of your order are:");
        for (Item item : items) {
            System.out.println(item.getDescription());
        }
        System.out.println("The total price is: " + calculateTotalPrice());
        System.out.println("The delivery method is: " + delivery.getName());
        System.out.println("The price for the delivery is: " + delivery.getPrice());
        System.out.println("The payment method is: " + payment.getName());
        delivery.deliver(items);
        payment.pay(calculateTotalPrice() + delivery.getPrice());
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item itemToRemove) {
        items.remove(itemToRemove);
    }

}
