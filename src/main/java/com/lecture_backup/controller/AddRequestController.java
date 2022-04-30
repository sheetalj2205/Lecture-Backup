/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.lecture_backup.controller;

import main.java.com.lecture_backup.model.AddRequest;
import main.java.com.lecture_backup.service.LectureBackupService;
import main.java.com.lecture_backup.view.SignInAsStudent;
import org.jdatepicker.DateModel;

/**
 *
 * @author HP
 */
public class AddRequestController {
    
    //create object of LectureBackupService class to call all insert, delete, update methods
    LectureBackupService service = new LectureBackupService();
    
    public void insert(SignInAsStudent view, String hm){
        String fullName = view.getNameField().getText();
        view.getUserId().setText(hm);
        String Subject = (String) view.getSubject().getSelectedItem();
        String Topic = view.getTopic().getText();
        String Reason = view.getjTextArea1().getText();
        String instructorname = (String) view.getInstructorName().getSelectedItem();
        DateModel dm = view.getDays1().getModel();
        String fromDate = dm.getDay() + "/" + dm.getMonth() + "/" + dm.getYear();
        DateModel dm1 = view.getDays2().getModel();
        String toDate = dm1.getDay() + "/" + dm1.getMonth() + "/" + dm1.getYear();
        //insert record
        AddRequest add = new AddRequest(1, fullName, hm, Subject, Topic, Reason, instructorname, fromDate, toDate);
        service.insert(add);
    }
    
}
