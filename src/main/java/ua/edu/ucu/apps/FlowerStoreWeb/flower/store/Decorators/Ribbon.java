package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Decorators;

import lombok.Getter;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flower;

public class Ribbon extends AbstractDecorator {
    @Getter
    private final String description = "Ribbon decorator";
    public Ribbon(Flower flower) {
        super.item = flower;
    }
    public double getPrice() {
        return 40 + item.getPrice();
    }
}
