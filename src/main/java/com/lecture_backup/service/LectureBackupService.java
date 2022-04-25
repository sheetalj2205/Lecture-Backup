/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.lecture_backup.service;

import main.java.com.lecture_backup.model.AcceptRequest;
import main.java.com.lecture_backup.model.AddRequest;
import main.java.com.lecture_backup.model.Instructor;
import main.java.com.lecture_backup.model.ScheduleLecture;
import main.java.com.lecture_backup.model.Student;
import main.java.com.lecture_backup.view.HomePage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author HP
 */
public class LectureBackupService {

    SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session session = sf.openSession();
    Transaction tx = session.beginTransaction();

    public void insert(ScheduleLecture sl) {
        session.save(sl);
        tx.commit();
        session.close();
    }

    public void insert(AcceptRequest ar) {
        session.save(ar);
        tx.commit();
        session.close();
    }

    public void insert(AddRequest ar) {
        session.save(ar);
        tx.commit();
        session.close();
    }

    public void insert(Instructor ir) {
        session.save(ir);
        tx.commit();
        session.close();
    }

    public void insert(Student st) {
        session.save(st);
        tx.commit();
        session.close();
    }

    public void delete(AddRequest ad) {
        session.delete(ad);
        tx.commit();
    }

    public void delete(Student st) {
        session.delete(st);
        tx.commit();
    }

    public void delete(Instructor ir) {
        session.delete(ir);
        tx.commit();
    }

    public void update(Student sd) {
        session.update(sd);
        tx.commit();
    }

    public void update(Instructor ir) {
        session.update(ir);
        tx.commit();
    }
}
