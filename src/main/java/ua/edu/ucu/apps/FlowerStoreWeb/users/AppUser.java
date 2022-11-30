package ua.edu.ucu.apps.FlowerStoreWeb.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class AppUser {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String email;
    private LocalDate dob = LocalDate.now();
    @Transient
    private int age;
    private boolean status = false;

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void notify_user() {
        if (!status) {
            this.setStatus(true);
        }
    }
    public boolean equals(AppUser another) {
        return this.email == another.email;
    }
}
