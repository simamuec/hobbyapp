package database;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
public interface IGenericDAO<T> {

    public boolean create(T t);
    public T find(Object id);
    public boolean update(T t);
    public boolean delete(Object id);
}
