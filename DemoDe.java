/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author gauravsharma
 */
public class DemoDe {

    public static void main(String[] args) {
        try {
            ObjectInputStream oin =
                    new ObjectInputStream(new FileInputStream(new File("c:\\java\\student10.txt")));
            Student st1 = (Student) oin.readObject();
            System.out.println(st1.rollno);
            System.out.println(st1.name);
            System.out.println(st1.marks);
            System.out.println(st1.grade);

            oin.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
