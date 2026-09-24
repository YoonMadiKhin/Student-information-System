/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author User
 */
public class CoursePrerequisite {
    private short id;
    private short courseId;
    private short prerequisiteCourseId;

    // Constructor
    public CoursePrerequisite(short id, short courseId, short prerequisiteCourseId) {
        this.id = id;
        this.courseId = courseId;
        this.prerequisiteCourseId = prerequisiteCourseId;
    }

    // Getter and Setter methods
    public short getId() { return id; }
    public void setId(short id) { this.id = id; }

    public short getCourseId() { return courseId; }
    public void setCourseId(short courseId) { this.courseId = courseId; }

    public short getPrerequisiteCourseId() { return prerequisiteCourseId; }
    public void setPrerequisiteCourseId(short prerequisiteCourseId) { this.prerequisiteCourseId = prerequisiteCourseId; }

    @Override
    public String toString() {
        return "CoursePrerequisite [CourseId=" + courseId + ", PrerequisiteCourseId=" + prerequisiteCourseId + "]";
    }
}
