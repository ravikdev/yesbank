/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author gauravsharma
 */
public class DemoFileOut {

    public static void main(String[] args) throws Exception {

//        File f1 = new File("C:\\java\\file1.txt");
//        FileWriter fw = new FileWriter(f1);
//        PrintWriter pw = new PrintWriter(fw);

        PrintWriter pw = new PrintWriter(new FileWriter(new File("C:\\java\\file1.txt")));

        pw.println("hello how r u?");
        pw.close();

    }
}
