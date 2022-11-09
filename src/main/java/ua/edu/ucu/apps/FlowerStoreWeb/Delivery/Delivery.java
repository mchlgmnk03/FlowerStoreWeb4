package ua.edu.ucu.apps.FlowerStoreWeb.Delivery;

import lombok.Getter;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Item;

import java.util.List;


public interface Delivery {
    void deliver(List<Item> items);

    String getName();
    String getDescription();
    double getPrice();
}
