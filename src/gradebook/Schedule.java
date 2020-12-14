/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.io.Serializable;

/**
 *
 * @author gotda
 */
public class Schedule implements Serializable{
    private String firstName,lastName ,attendance;
    private Class classObj; 
    private int grade;

    public Schedule(String firsttName,String lastName,Class classObj ,int grade ,String attendance) {
        this.firstName = firsttName;
        this.lastName = lastName;
        this.attendance = attendance;
        this.classObj = classObj;
        this.grade = grade;
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

   

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public Class getClassObj() {
        return classObj;
    }

    public void setClassObj(Class classObj) {
        this.classObj = classObj;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    
    public static void main (String [] args){
    
    }
}
