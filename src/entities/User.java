package entities;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
@Entity
@Table(name="User", schema="hobbyapp")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userID;
    @NotNull
    private String name;
    @NotNull
    private String username;
    @NotNull
    private String email;
    @NotNull
    private String city;
    @NotNull
    private String country;
    @NotNull
    @Past
    private Date dateOfBirth;
    @NotNull
    private String password;


    public User() {
    }

    public long getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (userID != user.userID) return false;
        if (!email.equals(user.email)) return false;
        if (!name.equals(user.name)) return false;
        if (!username.equals(user.username)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userID ^ (userID >>> 32));
        result = 31 * result + username.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return this.userID + this.username;
    }
}
