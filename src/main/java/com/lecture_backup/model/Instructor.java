package main.java.com.lecture_backup.model;
public class Instructor {
    private String userId;
    private String name;
    private String Password;
    private String gender;
    private String contactNo;
    private String Address;
    private String Department;
    private String Subject;

    public Instructor() {
    }

    public Instructor(String userId,String name, String Password, String gender, String contactNo, String Address, String Department, String Subject) {
        this.name = name;
        this.userId = userId;
        this.Password = Password;
        this.gender = gender;
        this.contactNo = contactNo;
        this.Address = Address;
        this.Department = Department;
        this.Subject = Subject;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
              
}
