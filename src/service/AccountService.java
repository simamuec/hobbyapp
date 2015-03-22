package service;

import database.IUserDao;
import database.UserDAO;
import entities.User;

import java.util.Date;

/**
 * Project: hobbyapp
 * Created by simamuec on 22.03.2015.
 */
public class AccountService {

    private IUserDao userDao;
    private User user;

    public AccountService() {

        userDao = new UserDAO();
        user = new User();
    }

    public void setUserData(String name, Date dateOfBirth) {
        user.setName(name);
        user.setDateOfBirth(dateOfBirth);
    }

    public void setAccountData(String username, String password) {
        user.setUsername(username);
        user.setPassword(password);
    }

    public void setUserAddress(String city, String country) {
        user.setCity(city);
        user.setCountry(country);
    }

    public void createAccount() {
        userDao.create(user);
    }

}
