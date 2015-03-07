package database;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
public interface GenericDAO<T> {

    public boolean create(T t);
    public T read();
    public boolean update(T t);
    public boolean delete(T t);
}
