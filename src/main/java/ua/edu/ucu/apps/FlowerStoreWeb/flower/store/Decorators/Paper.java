package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Decorators;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Paper extends AbstractDecorator {
    @Getter
    private final String description = "Paper decorator";

    public double getPrice() {
        return 13 + item.getPrice();
    }
}
