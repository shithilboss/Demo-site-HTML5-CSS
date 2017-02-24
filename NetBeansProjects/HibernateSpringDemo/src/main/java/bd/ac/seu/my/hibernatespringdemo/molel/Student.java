/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.my.hibernatespringdemo.molel;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author shithilboss
 */
@Entity
public class Student {
    @Id
    private String studentId;
    private String studentname;

    public Student() {
    }

    public Student(String studentId, String studentname) {
        this.studentId = studentId;
        this.studentname = studentname;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentname=" + studentname + '}';
    }
    
    
}
