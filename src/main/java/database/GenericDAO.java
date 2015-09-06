package database;

import javax.annotation.Resource;
import javax.persistence.*;

/**
 * Project: hobbyapp
 * Created by simamuec on 21.03.2015.
 */
public abstract class GenericDAO<T> implements IGenericDAO<T> {

    private T type = null;

    @PersistenceContext
    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    @Resource
    protected EntityTransaction entityTransaction;

    public GenericDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("hobbyapp");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    @Override
    public boolean create(T t) {
        try {
            entityTransaction.begin();
            entityManager.persist(t);
            entityTransaction.commit();
            entityManager.close();

            return true;
        } catch(Exception ex) {
            entityTransaction.rollback();
            return false;
        }
    }

    @Override
    public T find(Object id) {
        try {
            entityTransaction.begin();
            type = entityManager.find((Class<T>) type, id);
            entityTransaction.commit();
            entityManager.close();
        } catch(Exception ex) {
            entityTransaction.rollback();
        }
        return type;
    }

    @Override
    public boolean update(T t) {
        try {
            entityTransaction.begin();
            entityManager.merge(t);
            entityTransaction.commit();
            entityManager.close();

            return true;
        } catch(Exception ex) {
            entityTransaction.rollback();
            return false;
        }
    }

    @Override
    public boolean delete(Object id) {
        try {
            entityTransaction.begin();
            entityManager.remove(this.entityManager.getReference((Class<T>)type, id));
            entityTransaction.commit();
            entityManager.close();

            return true;
        } catch(Exception ex) {
            entityTransaction.rollback();
            return false;
        }
    }
}
