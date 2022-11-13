package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Decorators;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Basket extends AbstractDecorator {
    @Getter
    private final String description = "Basket decorator";

    public double getPrice() {
        return 4 + item.getPrice();
    }
}
