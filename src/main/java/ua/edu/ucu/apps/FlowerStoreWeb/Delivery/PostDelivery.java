package ua.edu.ucu.apps.FlowerStoreWeb.Delivery;

import lombok.Getter;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Item;

import java.util.List;

@Getter
public class PostDelivery implements Delivery {
    private final String name = "Post delivery";
    private final String description = "Your order will be delivered to the post office";
    private final double price = 20;

    public void deliver(List<Item> items) {
        System.out.println("Delivery is confirmed");
    }
}
