package entities;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
@Entity
@Table(name = "Activity", schema = "hobbapp")
public class Activity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long activityID;
    @ManyToOne
    private Hobby hobby;
    @ManyToMany
    private Set<User> partners;
    @NotNull
    private Date startDate;
    @NotNull
    @Future
    private Date endDate;
    @NotNull
    private boolean active;


    public Activity() {
    }

    public long getActivityID() {
        return activityID;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public Set<User> getPartners() {
        return partners;
    }

    public void setPartners(Set<User> partners) {
        this.partners = partners;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;

        Activity activity = (Activity) o;

        if (activityID != activity.activityID) return false;
        if (!endDate.equals(activity.endDate)) return false;
        if (!hobby.equals(activity.hobby)) return false;
        if (!startDate.equals(activity.startDate)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (activityID ^ (activityID >>> 32));
        result = 31 * result + hobby.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "" + this.activityID + this.hobby + this.startDate + this.endDate;
    }
}
