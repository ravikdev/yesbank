/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.File;

/**
 *
 * @author gauravsharma
 */
public class DemoFile {

    public static void main(String[] args) {

        File f1 = new File("C:\\Windows");
        if (f1.isDirectory()) {
            String names[] = f1.list();

            for (String s : names) {
                System.out.println(s);
            }
        } else {
            System.out.println("Its not a folder");
        }





    }
}
