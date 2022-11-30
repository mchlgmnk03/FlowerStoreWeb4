package ua.edu.ucu.apps.FlowerStoreWeb.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getAppUsers() {
        return appUserRepository.findAll();
    }

    public void addAppUser(AppUser user) {
        if (appUserRepository.findUserByEmail(user.getEmail()).isEmpty()) {
            appUserRepository.save(user);
        }
    }
}
