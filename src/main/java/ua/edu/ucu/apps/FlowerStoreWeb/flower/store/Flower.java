package ua.edu.ucu.apps.FlowerStoreWeb.flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Setter @AllArgsConstructor
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    private final String description = "This is a flower.";

//    public Flower(double sepalLength, FlowerColor color, double price, FlowerType){}
    public Flower(){}
    public String getColor() {
        return color.toString();
    }
}
