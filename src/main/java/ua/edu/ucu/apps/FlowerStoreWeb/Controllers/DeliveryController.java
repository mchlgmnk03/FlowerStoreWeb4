package ua.edu.ucu.apps.FlowerStoreWeb.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.FlowerStoreWeb.Delivery.DHLDelivery;
import ua.edu.ucu.apps.FlowerStoreWeb.Delivery.Delivery;
import ua.edu.ucu.apps.FlowerStoreWeb.Delivery.PostDelivery;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/delivery")
public class DeliveryController {
    @GetMapping
    public List<? extends Delivery> getPayment() {
        return Arrays.asList(new PostDelivery(), new DHLDelivery());
    }
}
