/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hib.dto;

/**
 *
 * @author HP
 */
public class query {
    private int serialNo;
    private String fullName;
    private String userID;
    private String subject;
    private String topic;
    private String reason;
    private String instructorName;
    private String fromDate;
    private String toDate;
    

    public query() {
    }

    public query(int serialNo, String fullName, String userID, String subject, String topic, String reason, String instructorName, String fromDate, String toDate) {
        this.serialNo = serialNo;
        this.fullName = fullName;
        this.userID = userID;
        this.subject = subject;
        this.topic = topic;
        this.reason = reason;
        this.instructorName = instructorName;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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