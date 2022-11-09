package Delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.FlowerStoreWeb.Delivery.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostDeliveryTest {
    Delivery delivery;

    @BeforeEach
    public void init() {
        delivery = new PostDelivery();
    }

    @Test
    void getPrice() {
        assertEquals(20, delivery.getPrice());
    }

    @Test
    void getDetails() {
        assertEquals("Post delivery", delivery.getName());
        assertEquals("Your order will be delivered to the post office", delivery.getDescription());
    }
}
