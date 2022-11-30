package ua.edu.ucu.apps.FlowerStoreWeb.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class AppUserController {
    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> getAppUsers() {
        return appUserService.getAppUsers();
    }

    @PostMapping
    public void addFlower(@RequestBody AppUser user) {
        appUserService.addAppUser(user);
    }
}
