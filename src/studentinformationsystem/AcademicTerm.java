/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author User
 */
public class AcademicTerm {
      private short id;
    private String code;
    private String name;
    private Semester semester;
    private String startDate;
    private String endDate;
    private boolean isCurrent;

    // Constructor
    public AcademicTerm(short id, String code, String name, Semester semester) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.semester = semester;
        this.isCurrent = false;
    }

    // Getter and Setter methods
    public short getId() { return id; }
    public void setId(short id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Semester getSemester() { return semester; }
    public void setSemester(Semester semester) { this.semester = semester; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }
    
    public boolean isCurrent() { return isCurrent; }
    public void setCurrent(boolean current) { isCurrent = current; }

    @Override
    public String toString() {
        return "AcademicTerm [Code=" + code + ", Name=" + name + ", Semester=" + semester +"]";
    }
}
