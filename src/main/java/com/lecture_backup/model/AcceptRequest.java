package main.java.com.lecture_backup.model;

public class AcceptRequest {
    private int serailNo;
    private String name;
    private String userId;
    private String subject;
    private String topic;
    private String reason;
    private String instructorName;
    private String fromDate;
    private String toDate;

    public AcceptRequest(int serailNo, String name, String userId, String subject, String topic, String reason, String instructorName, String fromDate, String toDate) {
        this.serailNo = serailNo;
        this.name = name;
        this.userId = userId;
        this.subject = subject;
        this.topic = topic;
        this.reason = reason;
        this.instructorName = instructorName;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }
    public AcceptRequest() {
    }

    public int getSerailNo() {
        return serailNo;
    }

    public void setSerailNo(int serailNo) {
        this.serailNo = serailNo;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
}
