package Payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.FlowerStoreWeb.Payment.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayPalTest {
    Payment payment;

    @BeforeEach
    public void init() {
        payment = new PayPal();
    }

    @Test
    void getDetails() {
        assertEquals("PayPal", payment.getName());
        assertEquals("Payment with PayPal", payment.getDescription());
    }
}
