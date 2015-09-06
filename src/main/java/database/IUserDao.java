package database;

import model.User;

/**
 * Project: hobbyapp
 * Created by simamuec on 21.03.2015.
 */
public interface IUserDao extends IGenericDAO<User>{

    User findUserByUsername(String username);
}
