package ua.edu.ucu.apps.FlowerStoreWeb.Delivery;

import lombok.Getter;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Item;

import java.util.List;

@Getter
public class DHLDelivery implements Delivery {
    private final String name = "DHL delivery";
    private final String description = "Your order will be delivered with DHL";
    private final double price = 40;

    public void deliver(List<Item> items) {
        System.out.println("Delivery is confirmed");
    }
}
