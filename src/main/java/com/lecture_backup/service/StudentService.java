/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.lecture_backup.service;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import main.java.com.lecture_backup.model.AcceptRequest;
import main.java.com.lecture_backup.model.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author HP
 */
public class StudentService {
    SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session session = sf.openSession();
    Transaction tx = session.beginTransaction();
    
    public Boolean updateStudentPass(String pass, String newPass, Class st, String id) {
        if (pass.equals(newPass)) {
            Student s = (Student) session.get(st,id);
            s.setPassword(newPass);
            session.update(s);
            tx.commit();
            return true;
        } 
        return false;
    }
    
    public String getStudentName(String id, Class st){
        Criteria crit = session.createCriteria(st);
        crit.add(Restrictions.eq("ID", id));

        ProjectionList pl = Projections.projectionList();
        pl.add(Projections.property("Name"));
        crit.setProjection(pl);
        List<String> data = crit.list();
        StringBuilder strbul = new StringBuilder();

        data.forEach((str) -> {
            strbul.append(str);
        });
        String str = strbul.toString();
        return str;
    }
    
    public void getAcceptRequestTable(String id, JTable jTable1, Class ar){
        Criteria crit1 = session.createCriteria(ar);
        crit1.add(Restrictions.eq("userId", id));
        List<AcceptRequest> data1 = crit1.list();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for (AcceptRequest sl : data1) {
            Object obj[] = {sl.getSerailNo(), sl.getName(), sl.getUserId(), sl.getSubject(), sl.getTopic(), sl.getReason(), sl.getInstructorName(), sl.getFromDate(), sl.getToDate()};
            dtm.addRow(obj);

        }
    }
}
