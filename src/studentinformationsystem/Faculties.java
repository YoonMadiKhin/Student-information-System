/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author User
 */
public class Faculties {
     private short id;
    private String code;
    private String name;
    private short deanId;
    private String phone;
    private String email;
    private boolean isActive;
    private String createdAt;

    // Constructor
    public Faculties(short id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;     
    }
    // Getter and Setter methods
    public short getId() { return id; }
    public void setId(short id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Faculty [Code=" + code + ", Name=" + name + "]";
    }
}
