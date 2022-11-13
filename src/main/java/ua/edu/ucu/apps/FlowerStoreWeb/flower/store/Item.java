package ua.edu.ucu.apps.FlowerStoreWeb.flower.store;

import lombok.Getter;

public abstract class Item {
    private String description;

    public String getDescription() {
        return description;
    }

    public abstract double getPrice();
}
