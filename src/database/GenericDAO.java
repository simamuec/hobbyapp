package database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Project: hobbyapp
 * Created by simamuec on 21.03.2015.
 */
public abstract class GenericDAO<T> implements IGenericDAO<T> {

    private T type;

    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    protected EntityTransaction entityTransaction;

    public GenericDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("hobbyapp");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    @Override
    public boolean create(T t) {
        entityTransaction.begin();
        entityManager.persist(t);
        entityTransaction.commit();
        entityManager.close();

        return true;
    }

    @Override
    public T find(Object id) {
        entityTransaction.begin();
        type = entityManager.find((Class<T>) type, id);
        entityTransaction.commit();
        entityManager.close();

        return type;
    }

    @Override
    public boolean update(T t) {
        entityTransaction.begin();
        entityManager.merge(t);
        entityTransaction.commit();
        entityManager.close();

        return true;
    }

    @Override
    public boolean delete(Object id) {
        entityTransaction.begin();
        entityManager.remove(this.entityManager.getReference((Class<T>) type, id));
        entityTransaction.commit();
        entityManager.close();

        return true;
    }
}
