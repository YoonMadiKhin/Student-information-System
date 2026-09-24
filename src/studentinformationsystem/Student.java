/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author User
 */
public class Student {
    private short id;
    private String studentNumber;
    private String nationalId;
    private String name;
    private String surname;
    private String birthDate;
    private Gender gender;
    private String email;
    private String phoneNumber;
    private String address;
    private String programId;
    private int enrollmentYear;
    private int classYear;
    private String photoUrl;
    private String createdAt;

    // Constructor
    public Student(short id, String studentNumber, String name, String surname, Gender gender) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    
}
 // Getter and Setter methods 
    public short getId() { return id;  }
    public void setId(short id) { this.id = id; }
    
    public String getStudentNumber() { return studentNumber; }
    public void setStudentNumber(String studentNumber) { this.studentNumber = studentNumber; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    
    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "Student [Number=" + studentNumber + ", Name=" + name + " " + surname + ", Gender=" + gender + "]";
    }
}