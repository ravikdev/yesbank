/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author gauravsharma
 */
public class DemoSe {

    public static void main(String[] args) {
        try {
            Student s1 = new Student();
            s1.rollno = 1001;
            s1.name = "rahul";
            s1.marks = 56.23;
            s1.grade = 'B';
            s1.password= "abc123";

             
            
            File f1 = new File("c:\\java\\student10.txt");
            FileOutputStream fout = new FileOutputStream(f1);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(s1);
            oout.close();
        } catch (Exception e) {
            System.out.println(e);
        }



    }
}
