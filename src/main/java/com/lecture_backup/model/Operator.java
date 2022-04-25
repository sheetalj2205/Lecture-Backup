/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.lecture_backup.model;

/**
 *
 * @author HP
 */
public class Operator {
    private String operator_Id;
    private String operator_name;
    private String operator_pswrd;
    private String contact_number;
    private String mail_ID;

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name;
    }

    public String getOperator_Id() {
        return operator_Id;
    }

    public void setOperator_Id(String operator_Id) {
        this.operator_Id = operator_Id;
    }

    public String getOperator_pswrd() {
        return operator_pswrd;
    }

    public void setOperator_pswrd(String operator_pswrd) {
        this.operator_pswrd = operator_pswrd;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getMail_ID() {
        return mail_ID;
    }

    public void setMail_ID(String mail_ID) {
        this.mail_ID = mail_ID;
    }

    public Operator() {
    }

    public Operator(String operator_name, String operator_Id, String operator_pswrd, String contact_number, String mail_ID) {
        this.operator_name = operator_name;
        this.operator_Id = operator_Id;
        this.operator_pswrd = operator_pswrd;
        this.contact_number = contact_number;
        this.mail_ID = mail_ID;
    }
     
}
