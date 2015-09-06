package database;

import model.User;

/**
 * Project: hobbyapp
 * Created by simamuec on 21.03.2015.
 */
public class UserDAO extends GenericDAO<User> implements IUserDao {

    @Override
    public User findUserByUsername(String username) {
        return super.find(username);
    }
}
