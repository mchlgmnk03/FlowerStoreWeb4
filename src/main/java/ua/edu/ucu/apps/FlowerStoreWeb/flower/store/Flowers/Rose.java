package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flowers;

import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums.FlowerColor;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums.FlowerType;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flower;

public class Rose extends Flower {

    public Rose() {
//        super();
        this.setColor(FlowerColor.RED);
        this.setFlowerType(FlowerType.ROSE);
    }
}
