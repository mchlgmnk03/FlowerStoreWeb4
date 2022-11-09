package ua.edu.ucu.apps.FlowerStoreWeb.flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBucketList  = new ArrayList<>();

    boolean search(FlowerBucket bucket) {
        for (FlowerBucket item : flowerBucketList) {
            if (item.equals(bucket)) {
                return true;
            }
        }
        return false;
    }
}
