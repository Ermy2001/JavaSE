/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;
import com.mycompany.mavenproject3.obj.Exam;
import com.mycompany.mavenproject3.obj.Student;
import java.util.Scanner;

/**
 *
 * @author ermy
 */
public class Mavenproject3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        getData(scanner, student);
        showResult(student);
    }




    // -------------------  Methods ------------------- //
    private static void getData(Scanner scanner, Student student) {
        System.out.println("You should register.\nplease enter your \"name\", \"userName\" & \"password\"");
//        String name = scanner.nextLine();
//        String username = scanner.nextLine();
//        String password = scanner.nextLine();
//
//        Student student = new Student(name, username, password);

        student.setName(scanner.nextLine());
        student.setUserName(scanner.nextLine());
        student.setPassword(scanner.nextLine());

        System.out.println("please enter \"subject name\" and \"grade point\"");
        Exam exam = new Exam(scanner.nextLine(), scanner.nextFloat());
        student.setExam(exam);
    }

    private static void showResult(Student student) {
        System.out.println();
        System.out.println("Your point is " + student.getExamPoint());
        String result = student.getExamPoint() > 10 ? "passed" : "failed";
        System.out.println(result);
    }
    
}
