/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author gauravsharma
 */
public class DemoFileInBytes {

    public static void main(String[] args) throws Exception {

        File f1 = new File("C:\\java\\file1.txt");
        FileInputStream fi = new FileInputStream(f1);
        InputStreamReader ins = new InputStreamReader(fi);
        char ch;
        int length = fi.available();

        for (int i = 0; i < length; i++) {
            ch = (char) ins.read();
            System.out.print(ch);
        }




    }
}
