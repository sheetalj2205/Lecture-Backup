package main.java.com.lecture_backup.model;

public class ScheduleLecture {
    private int serialNo;
    private String name;
    private String userId;
    private String subject;
    private String topic;
    private String date;
    private String time;

    public ScheduleLecture() {
    }

    public ScheduleLecture(String name, String userId, String subject, String topic, String date, String time) {
        this.name = name;
        this.userId = userId;
        this.subject = subject;
        this.topic = topic;
        this.date = date;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
}
