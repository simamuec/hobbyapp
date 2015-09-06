package model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
@Entity
@Table(name = "Category", schema = "hobbyapp")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoryID;
    @OneToOne
    private Category subCategory;
    @NotNull
    private String name;


    public Category() {
    }

    public long getCategoryID() {
        return categoryID;
    }

    public Category getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(Category subCategory) {
        this.subCategory = subCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        if (categoryID != category.categoryID) return false;
        return name.equals(category.name);

    }

    @Override
    public int hashCode() {
        int result = (int) (categoryID ^ (categoryID >>> 32));
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return this.categoryID + this.name;
    }

}
