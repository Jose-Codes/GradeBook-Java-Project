/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.io.*;
/**
 *
 * @author gotda
 */
public class Student implements Serializable{
    private String firstName, lastName;
    private int grade;
    private int studentID;
    private Class classObj;

    public Student(String firstName, String lastName,Class classObj,int grade, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentID = studentID;
        this.classObj = classObj;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Class getClassObj() {
        return classObj;
    }

    public void setClassObj(Class classObj) {
        this.classObj = classObj;
    }
    
    
    public static void main(String [] args){
    }
    
    
}
