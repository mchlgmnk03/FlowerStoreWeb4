package ua.edu.ucu.apps.FlowerStoreWeb.flower.store;

import lombok.Getter;

public class Item {
    @Getter
    private String description;
    @Getter
    private double price;

    public String getDescription() {
        return description;
    }

}
