/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_backup;
import hib.dto.Student;
import static java.lang.System.out;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class insertRecord {
    public static void main(String...ar){
    SessionFactory sf= new Configuration().configure().buildSessionFactory();
    Session session = sf.openSession();
    Transaction tx= session.beginTransaction();
    Scanner sc = new Scanner(System.in);
    out.println("Enter student ID");
    String id= sc.next();
    out.println("Enter Student name");
    String name= sc.next();
    out.println("Enter Student password");
    String pswd = sc.next();
    out.println("Enter Student date of birth");
    String dateofbirth= sc.next();
    out.println("Enter Student course");
    String studentCourse= sc.next();
    out.println("Enter Student year");
    String student_year= sc.next();
    out.println("Enter Student branch");
    String student_branch= sc.next();
    out.println("Enter Student section");
    String student_section= sc.next();
    out.println("Enter Student contact number");
    long number= sc.nextLong();
    
    
//    session.save(ref);
    tx.commit();
    session.close();
    out.println("Record Inserted Successfully");
    
    
    
}
}