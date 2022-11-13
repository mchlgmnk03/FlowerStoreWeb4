package ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums;

public enum FlowerType {

    CHAMOMILE("Chamomile"), ROSE("Rose"), TULIP("Tulip");
    private final String stringRepresentation;

    FlowerType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
