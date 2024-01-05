/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.obj;

/**
 *
 * @author ermy
 */
public class Exam {
    private String subjectName;
    private float examPoint;

    // Constructors
    public Exam() {
    }
    public Exam(String subjectName, float examPoint) {
        this.subjectName = subjectName;
        this.examPoint = examPoint;
    }



    //getters & setters
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public float getExamPoint() {
        return examPoint;
    }

    public void setExamPoint(float examPoint) {
        this.examPoint = examPoint;
    }
    
}
