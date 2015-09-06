package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
@MappedSuperclass
public abstract class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Entity() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
