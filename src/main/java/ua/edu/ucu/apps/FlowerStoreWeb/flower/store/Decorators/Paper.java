package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Decorators;

import lombok.Getter;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flower;

public class Paper extends AbstractDecorator {
    @Getter
    private final String description = "Paper decorator";

    public Paper(Flower flower) {
        super.item = flower;
    }

    public double getPrice() {
        return 13 + item.getPrice();
    }
}
