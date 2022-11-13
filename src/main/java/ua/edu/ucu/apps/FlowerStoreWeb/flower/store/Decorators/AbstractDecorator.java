package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Decorators;

import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Item;

public abstract class AbstractDecorator extends Item {
    public Item item;

    public abstract String getDescription();
}
