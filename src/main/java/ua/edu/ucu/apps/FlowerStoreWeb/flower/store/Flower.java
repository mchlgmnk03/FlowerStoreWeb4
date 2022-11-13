package ua.edu.ucu.apps.FlowerStoreWeb.flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums.FlowerColor;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Enums.FlowerType;

import javax.persistence.*;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Getter
public class Flower extends Item {
    @Id
    @GeneratedValue
    private int id;
    private double sepalLength;
    @Enumerated(EnumType.STRING)
    private FlowerColor color;
    private double price;
    @Enumerated(EnumType.STRING)
    private FlowerType flowerType;
    private final String description = "This is a flower.";

    public String getColor() {
        return color.toString();
    }
}
