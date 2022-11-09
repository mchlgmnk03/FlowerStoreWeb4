package Delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.FlowerStoreWeb.Delivery.*;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.FlowerBucket;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DHLDeliveryTest {
    Delivery delivery;

    @BeforeEach
    public void init() {
        delivery = new DHLDelivery();
    }

    @Test
    void getPrice() {
        assertEquals(40, delivery.getPrice());
    }

    @Test
    void getDetails() {
        assertEquals("DHL delivery", delivery.getName());
        assertEquals("Your order will be delivered with DHL", delivery.getDescription());
    }
}
