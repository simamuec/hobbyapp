package database;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
public interface IGenericDAO<T> {

    boolean create(T t);
    T find(Object id);
    boolean update(T t);
    boolean delete(Object id);
}
