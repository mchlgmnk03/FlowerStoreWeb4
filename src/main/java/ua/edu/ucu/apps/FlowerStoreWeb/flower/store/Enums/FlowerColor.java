package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF"), WHITE("#FFFFFF");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
