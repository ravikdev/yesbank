/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author gauravsharma
 */
public class DemoFileWrite {

    public static void main(String args[]) throws Exception
    {
        
       Integer i[] = new Integer[10];//creating ann array
        int rollno;
        String name;
        float marks;
        char grade;

        Scanner s = new Scanner(System.in);//imported scanner class 
        System.out.println("Enter Rollno");
        rollno = s.nextInt();
        System.out.println("Enter Name");
        name = s.next();                   //for taking string
        System.out.println("Enter Marks");
        marks = s.nextFloat();
        System.out.println("Enter Grade");
        String st = s.next();
        grade = st.charAt(0);

        System.out.println("Student Rollno no is " + rollno);
        System.out.println("Student Name no is " + name);
        System.out.println("Student Marks no is " + marks);
        System.out.println("Student Grade no is " + grade);
        
        File f1 =new File("C:\\java\\studentdata.txt");
        FileWriter fw =new FileWriter(f1,true);
        PrintWriter pw =new PrintWriter(fw);
        
        pw.println(rollno);
        pw.println(name);
        pw.println(marks);
        pw.println(grade);

        pw.close();
    }
}
