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
public class Class implements Serializable{
    private String className, classPeriod;

    public Class(String className, String classPeriod) {
        this.className = className;
        this.classPeriod = classPeriod;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassPeriod() {
        return classPeriod;
    }

    public void setClassPeriod(String classPeriod) {
        this.classPeriod = classPeriod;
    }
    
    
    public static void main (String [] args){
    
    }
}
