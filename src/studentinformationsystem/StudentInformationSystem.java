/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;
 import java.util.ArrayList;
/**
 *
 * @author User
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Student student1 = new Student((short) 1, "240504524", "Yoon Madi", "Khin", Gender.Female);
        studentList.add(student1);

        System.out.println("=== Registered Students ===");
        for (Student s : studentList) {
            System.out.println(s.toString());
        }

        Departments dept = new Departments((short) 1, "234607", "Software Engineering", (short) 1);
        System.out.println("\n=== Department ===");
        System.out.println(dept);

        AcademicTerm term = new AcademicTerm((short) 1, "2024-1", "2024-25 Fall Semester", Semester.fall);
        System.out.println("\n=== Active Term ===");
        System.out.println(term);
    }
}

