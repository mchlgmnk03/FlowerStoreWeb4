package ua.edu.ucu.apps.FlowerStoreWeb;

import ua.edu.ucu.apps.FlowerStoreWeb.Delivery.Delivery;
import ua.edu.ucu.apps.FlowerStoreWeb.Payment.Payment;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Item;
import ua.edu.ucu.apps.FlowerStoreWeb.users.AppUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Order {
    private HashMap<Integer, List<Item>> orders = new HashMap<>();
    private List<AppUser> users = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice(int id) {
        double price = 0.0;
        for (Item pack : orders.get(id)) {
            price += pack.getPrice();
        }
        return price;
    }

    public void processOrder(int id) {
        System.out.println("The contents of your order are:");
        for (Item item : orders.get(id)) {
            System.out.println(item.getDescription());
        }
        System.out.println("The total price is: " + calculateTotalPrice(id));
        System.out.println("The delivery method is: " + delivery.getName());
        System.out.println("The price for the delivery is: " + delivery.getPrice());
        System.out.println("The payment method is: " + payment.getName());
        delivery.deliver(orders.get(id));
        payment.pay(calculateTotalPrice(id) + delivery.getPrice());
    }

    public void addItem(Item item, int id) {
        orders.get(id).add(item);
    }

    public void removeItem(Item itemToRemove, int id) {
        orders.get(id).remove(itemToRemove);
    }

    public void notifyUser() {
        for (AppUser user : users) {
            user.notify_user();
        }
    }
    public void notifyUser(AppUser userToNotify) {
        for (AppUser user : users) {
            if (user.equals(userToNotify)) {
                user.notify_user();
                return;
            }
        }
        System.out.println("There is no such user.");
    }

}
