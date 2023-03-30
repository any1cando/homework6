package com.mirea.kt.example;

import java.io.Serializable;

public class Message implements Serializable {
    private int id;
    private String body;
    private String type;
    private boolean hasAttachment;
    private long timestamp;

    private static final long serialVersionUID = -3380157693869190848L;

    public Message(int id, String body, String type, boolean hasAttachment, long timestamp) {
        this.id = id;
        this.body = body;
        this.type = type;
        this.hasAttachment = hasAttachment;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", type='" + type + '\'' +
                ", hasAttachment=" + hasAttachment +
                ", timestamp=" + timestamp +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasAttachment() {
        return hasAttachment;
    }

    public void setHasAttachment(boolean hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
