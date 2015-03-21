package database;

/**
 * Project: hobbyapp
 * Created by simamuec on 21.03.2015.
 */
public class GenericDAO<T> implements IGenericDAO<T> {

    T type;

    @Override
    public boolean create(T t) {
        return false;
    }

    @Override
    public T read() {
        return null;
    }

    @Override
    public boolean update(T t) {
        return false;
    }

    @Override
    public boolean delete(T t) {
        return false;
    }
}
