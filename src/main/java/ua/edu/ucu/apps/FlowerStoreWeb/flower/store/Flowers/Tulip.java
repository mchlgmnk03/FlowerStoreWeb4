package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flowers;

import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums.FlowerColor;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums.FlowerType;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flower;

public class Tulip extends Flower {
    public Tulip() {
        super();
        this.setColor(FlowerColor.BLUE);
        this.setFlowerType(FlowerType.TULIP);
    }
}
