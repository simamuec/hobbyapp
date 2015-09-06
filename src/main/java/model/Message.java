package model;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Project: hobbyapp
 * Created by simamuec on 07.03.2015.
 */
@Entity
@Table(name="Message", schema = "hobbyapp")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long messageID;
    private String content;
    private User sender;
    private User receiver;


    public Message() {
    }

    public long getMessageID() {
        return messageID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;

        Message message = (Message) o;

        if (messageID != message.messageID) return false;
        if (!receiver.equals(message.receiver)) return false;
        return sender.equals(message.sender);

    }

    @Override
    public int hashCode() {
        int result = (int) (messageID ^ (messageID >>> 32));
        result = 31 * result + sender.hashCode();
        result = 31 * result + receiver.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "" + this.messageID;
    }
}
