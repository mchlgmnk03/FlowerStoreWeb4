package ua.edu.ucu.apps.FlowerStoreWeb.flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPackList = new ArrayList<>();
    private final String description = "This a FlowerBucket.";

    public void add(FlowerPack pack) {
        flowerPackList.add(pack);
    }

    public double getPrice() {
        double price = 0.0;
        for (FlowerPack pack : flowerPackList) {
            price += pack.getPrice();
        }
        return price;
    }

}
