package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Decorators;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Ribbon extends AbstractDecorator {
    @Getter
    private final String description = "Ribbon decorator";

    public double getPrice() {
        return 40 + item.getPrice();
    }
}
