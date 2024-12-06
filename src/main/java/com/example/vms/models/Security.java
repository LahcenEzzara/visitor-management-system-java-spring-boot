package com.example.vms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accessZone;
    private String userOrRole;
    
    @OneToOne
    @JoinColumn(name = "badge_id")
    private Badge badge;

    // Constructors
    public Security() {}

    public Security(String accessZone, String userOrRole) {
        this.accessZone = accessZone;
        this.userOrRole = userOrRole;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }
    public String getAccessZone() {
        return accessZone;
    }

    public void setAccessZone(String accessZone) {
        this.accessZone = accessZone;
    }

    public String getUserOrRole() {
        return userOrRole;
    }

    public void setUserOrRole(String userOrRole) {
        this.userOrRole = userOrRole;
    }
}
