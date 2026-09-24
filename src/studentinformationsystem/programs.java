/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author User
 */
public class programs {
    private short id;
    private String code;
    private String name;
    private short departmentId;
    private String degreelevel;
    private short totalCredits;
    private short durationYears;
    private String languages;
    private boolean isActive;
    
    //Constructor
    public programs(short id, String code, String name, short departmentId){
        this.id= id;
        this.code = code;
        this.name = name;
        this.departmentId = departmentId;
 
    }
    
    //Getter and Setter methods
     public short getId() { return id; }
    public void setId(short id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public short getDepartmentId() { return departmentId; }
    public void setDepartmentId(short departmentId) { this.departmentId = departmentId; }

    public String getDegreeLevel() { return degreelevel; }
    public void setDegreeLevel(String degreeLevel) { this.degreelevel = degreeLevel; }

    @Override
    public String toString() {
        return "Program [Code=" + code + ", Name=" + name + "]";
    }   
}
