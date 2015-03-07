package entities;

import java.io.Serializable;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
public class Conversation implements Serializable {

    private long conversationID;
    private Message[] messages;
    private Activity activity;


    public Conversation() {
    }

    public long getConversationID() {
        return conversationID;
    }

    public Message[] getMessages() {
        return messages;
    }

    public void setMessages(Message[] messages) {
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
        if (!activity.equals(that.activity)) return false;

        return true;
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
