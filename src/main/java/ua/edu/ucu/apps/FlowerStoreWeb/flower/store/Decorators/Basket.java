package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Decorators;

import lombok.Getter;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flower;

public class Basket extends AbstractDecorator {
    @Getter
    private final String description = "Basket decorator";
    public Basket(Flower flower) {
        super.item = flower;
    }

    public double getPrice() {
        return 4 + item.getPrice();
    }
}
