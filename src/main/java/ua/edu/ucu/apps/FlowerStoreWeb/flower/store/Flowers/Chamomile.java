package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flowers;

import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums.FlowerColor;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums.FlowerType;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flower;

public class Chamomile extends Flower {
    public Chamomile() {
        super();
        this.setColor(FlowerColor.WHITE);
        this.setFlowerType(FlowerType.CHAMOMILE);
    }
}
