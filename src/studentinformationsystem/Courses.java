/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author User
 */
public class Courses {
    private short id;
    private String code;
    private String name;
    private short departmentId;
    private short credits;
    private short theoryHours;
    private short labHours;
    private boolean isActive;

    // Constructor
    public Courses(short id, String code, String name, short departmentId, short credits) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.departmentId = departmentId;
        this.credits = credits;
    }

    // Getter and Setter methods
    public short getId() { return id; }
    public void setId(short id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public short getCredits() { return credits; }
    public void setCredits(short credits) { this.credits = credits; }

    @Override
    public String toString() {
        return "Course [Code=" + code + ", Name=" + name + ", Credits=" + credits + "]";
    }
}
