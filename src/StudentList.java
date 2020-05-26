/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heert
 */

import java.util.Scanner;
public class StudentList {
    
   public static void main(String[] args) {
        
        Student[] students = new Student[2];
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < students.length; i++) {
        
            System.out.println("Enter the student's name");
            String name = input.nextLine();
            Student student = new Student(name);
            
            students[i] = student;       
        }
        
        System.out.println("Printing the students:");
        
        String format = "The student's name is %s\n";
        
        for (Student student: students) {
        
            System.out.printf(format, student.getName());
            
        }
    }
}
