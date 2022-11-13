package Decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Decorators.AbstractDecorator;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Decorators.Ribbon;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums.FlowerColor;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums.FlowerType;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flower;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RibbonTest {
    AbstractDecorator ribbon;
    Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower(1, 100, FlowerColor.BLUE, 100, FlowerType.TULIP);
        ribbon = new Ribbon(flower);
    }

    @Test
    void getPrice() {
        assertEquals(140, ribbon.getPrice());
    }

    @Test
    void getDetails() {
        assertEquals("Ribbon decorator", ribbon.getDescription());
    }
}
