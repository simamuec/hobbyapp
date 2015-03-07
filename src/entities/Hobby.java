package entities;

import java.io.Serializable;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
public class Hobby implements Serializable {

    private long hobbyID;
    private String name;
    private String description;
    private Category category;


    public Hobby() {
    }

    public long getHobbyID() {
        return hobbyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hobby)) return false;

        Hobby hobby = (Hobby) o;

        if (hobbyID != hobby.hobbyID) return false;
        if (!name.equals(hobby.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (hobbyID ^ (hobbyID >>> 32));
        result = 31 * result + name.hashCode();
        return result;
    }

    public String toString() {
        return this.hobbyID + this.name;
    }
}
