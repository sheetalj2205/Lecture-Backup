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
public class Student {
    
    private String ID;
    private String Name;
    private String Password;
    private String Gender;
    private String ContactNumber;
    private String Address;
    private String DOB;
    private String Course;
    private String Branch;
    private String Year;
    private String Section;


    public Student(String ID,String Name, String Password, String Gender, String ContactNumber, String Address, String DOB, String Course, String Branch, String Year, String Section) {
        this.Name = Name;
        this.ID = ID;
        this.Password = Password;
        this.Gender = Gender;
        this.ContactNumber = ContactNumber;
        this.Address = Address;
        this.DOB = DOB;
        this.Course = Course;
        this.Branch = Branch;
        this.Year = Year;
        this.Section = Section;
    }
    
    
    

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String Section) {
        this.Section = Section;
    }
    
    
    
    
    
}
