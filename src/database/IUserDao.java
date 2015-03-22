package database;

import entities.User;

/**
 * Project: hobbyapp
 * Created by simamuec on 21.03.2015.
 */
public interface IUserDao extends IGenericDAO<User>{

    public User findUserByUsername(String username);
}
