package org.aleksjdev.profit.model;

import javax.persistence.*;

/**
 * Profile entity class
 */
@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long id;

    @Column(name = "profile_name")
    private String profileName;

    public Profile() {
    }

    public Profile(String profileName) {
        this.profileName = profileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
}
