/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author User
 */
public class ProgramCourse {
     private short id;
    private short programId;
    private short courseId;
    private short semester;
    private boolean isMandatory;

    // Constructor
    public ProgramCourse(short id, short programId, short courseId, short semester) {
        this.id = id;
        this.programId = programId;
        this.courseId = courseId;
        this.semester = semester;
        this.isMandatory = true;
    }

    // Getter and Setter methods
    public short getId() { return id; }
    public void setId(short id) { this.id = id; }

    public short getProgramId() { return programId; }
    public void setProgramId(short programId) { this.programId = programId; }

    public short getCourseId() { return courseId; }
    public void setCourseId(short courseId) { this.courseId = courseId; }

    public short getSemester() { return semester; }
    public void setSemester(short semester) { this.semester = semester; }

    @Override
    public String toString() {
        return "ProgramCourse [ProgramId=" + programId + ", CourseId=" + courseId + ", Semester=" + semester + "]";
    }
}
