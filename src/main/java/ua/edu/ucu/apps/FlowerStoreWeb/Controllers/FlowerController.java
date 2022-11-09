package ua.edu.ucu.apps.FlowerStoreWeb.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.Flower;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.FlowerColor;
import ua.edu.ucu.apps.FlowerStoreWeb.flower.store.FlowerType;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {
    @GetMapping
    public List<Flower> hello() {
        return Arrays.asList(new Flower(100, FlowerColor.BLUE, 100, FlowerType.TULIP),
                new Flower(100, FlowerColor.RED, 100, FlowerType.ROSE),
                new Flower(100, FlowerColor.WHITE, 100, FlowerType.CHAMOMILE));
    }
}
