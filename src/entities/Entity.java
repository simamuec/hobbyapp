package entities;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
public interface Entity {

    @Override
    public String toString();

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object other);

}
