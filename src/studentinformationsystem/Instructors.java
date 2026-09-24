/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author User
 */
public class Instructors {
    private short id;
    private String employeeNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private short departmentId;
    private InstructorTitle title;
    private String specialization;
    private String hireDate;
    private boolean isActive;

    // Constructor
    public Instructors(short id, String employeeNo, String firstName, String lastName, String email, InstructorTitle title) {
        this.id = id;
        this.employeeNo = employeeNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        
    }

    // Getter and Setter methods
    public short getId() { return id; }
    public void setId(short id) { this.id = id; }

    public String getEmployeeNo() { return employeeNo; }
    public void setEmployeeNo(String employeeNo) { this.employeeNo = employeeNo; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public InstructorTitle getTitle() { return title; }
    public void setTitle(InstructorTitle title) { this.title = title; }
    

    @Override
    public String toString() {
        return "Instructor [EmployeeNo=" + employeeNo + ", Name=" + firstName + " " + lastName + ", Title=" + title + "]";
    }
}
