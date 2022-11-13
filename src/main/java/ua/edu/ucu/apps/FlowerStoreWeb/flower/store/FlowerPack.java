package ua.edu.ucu.apps.FlowerStoreWeb.flower.store;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;


    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }
}
