package model;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Set;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
@Entity
public class Conversation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long conversationID;
    @OneToMany
    private Set<Message> messages;

    private Activity activity;


    public Conversation() {
    }

    public long getConversationID() {
        return conversationID;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conversation)) return false;

        Conversation that = (Conversation) o;

        if (conversationID != that.conversationID) return false;
        return activity.equals(that.activity);

    }

    @Override
    public int hashCode() {
        int result = (int) (conversationID ^ (conversationID >>> 32));
        result = 31 * result + activity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "" + this.conversationID + this.activity;
    }
}
