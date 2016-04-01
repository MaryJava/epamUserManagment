package com.epam.model;

import com.epam.model.converter.UserProfileConverter;
import com.epam.model.converter.UserStatusConverter;
import com.epam.model.lcp.UserProfile;
import com.epam.model.lcp.UserStatus;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Sahak_Babayan on 3/29/2016.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_status")
    @Convert(converter = UserStatusConverter.class)
    private UserStatus status;

    @Column(name = "user_profile")
    @Convert(converter = UserProfileConverter.class)
    private UserProfile profile;

    @NotEmpty(message = "{err.field.first.name.required}")
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty(message = "{err.field.last.name.required}")
    @Column(name = "last_name")
    private String lastName;

    @Email(message = "{err.field.email.invalid}")
    @NotEmpty(message = "{err.field.email.required}")
    @Column(name = "email")
    private String email;

    @NotEmpty(message = "{err.field.password.required}")
    @Column(name = "password")
    private String password;

    public User(){}

    public User(User user) {
        this.id = user.id;
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.email = user.email;
        this.password = user.password;
        this.status = user.status;
        this.profile = user.profile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

}
