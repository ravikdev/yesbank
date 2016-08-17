/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author gauravsharma
 */
public class Student implements Serializable {

    transient int rollno;
    String name;
    double marks;
    char grade;
    String password;
}
//    
//    void getData() {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter Rollno");
//        rollno = s.nextInt();
//        System.out.println("Enter Name");
//        name = s.next();
//        System.out.println("Enter Marks");
//        marks = s.nextFloat();
//        System.out.println("Enter Grade");
//        String st = s.next();
//        grade = st.charAt(0);
//
//    }
//
//    void displayData() {
//        System.out.println("Student Rollno no is " + rollno);
//        System.out.println("Student Name no is " + name);
//        System.out.println("Student Marks no is " + marks);
//        System.out.println("Student Grade no is " + grade);
//    }
//
//    public static void main(String[] args) {
//       
//
//    }
//}
