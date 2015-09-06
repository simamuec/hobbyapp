package services;

import database.IUserDao;
import database.UserDAO;
import model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Date;

/**
 * Project: hobbyapp
 * Created by simamuec on 22.03.2015.
 */
@Path("accountservice")
public class AccountService {

    private IUserDao userDao;
    private User user;

    public AccountService() {

        userDao = new UserDAO();
        user = new User();
    }

    @GET
    @Produces("text/html")
    public String messages() {
        return "<html lang=\"de\"><body><h1>Hello, World!!</body></h1></html>";
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
