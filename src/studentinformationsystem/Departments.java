/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author User
 */
public class Departments {
    private short id;
    private String code;
    private String name;
    private short facultyId;
    private short headInstructorId;
    private String email;
    private boolean isActive;
    
    //Constructor
    public Departments(short id, String code, String name, short facultyId){
        this.id = id;
        this.code = code;
        this.name =name;
        this.facultyId = facultyId;
    }
    //Getter and Setter methods
    public short getId() { return id; }
    public void setId(short id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public short getFacultyId() { return facultyId; }
    public void setFacultyId(short facultyId) { this.facultyId = facultyId; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Department [Code=" + code + ", Name=" + name + "]";
    }
}

