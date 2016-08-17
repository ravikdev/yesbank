/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gauravsharma
 */
class Student1 {

    private int rollno;
    private String name;
    private double marks;
    private char grade;

    public void getData() {
        rollno = 1001;
        name = "amit";
        marks = 56.23;
        grade = 'B';

    }

    public void displayData() {
        System.out.println("Student Rollno no is " + rollno);
        System.out.println("Student Name no is " + name);
        System.out.println("Student Marks no is " + marks);
        System.out.println("Student Grade no is " + grade);
    }
}

public class DemoA {

    public static void main(String[] args) {
        
        DemoFileWrite o = new DemoFileWrite();
        //o.c=90;
        Student1 s1 = new Student1();
        s1.getData();
        s1.displayData();
    }
}
