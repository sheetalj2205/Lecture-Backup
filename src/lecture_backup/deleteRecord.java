/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_backup;

import hib.dto.Student;
import static java.lang.System.out;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author HP
 */
public class deleteRecord {
    public static void main(String...ar){
    SessionFactory sf= new Configuration().configure().buildSessionFactory();
    Session session = sf.openSession();
    Transaction tx= session.beginTransaction();
    Scanner sc = new Scanner(System.in);
    out.println("Enter Student Id");
    String studentID= sc.next();
    Student st = (Student)session.get(Student.class,studentID);
    if(st==null){
        out.println("Record not found");
    }
    else{
        session.delete(st);
        out.println("Record Deleted");
    }
                
  }
}
