/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author gauravsharma
 */
public class DemoFileIn {
    public static void main(String[] args) throws Exception {
        File f1 = new File("C:\\java\\file1.txt");
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        while (str != null) {
            System.out.println(str);
            str = br.readLine();
        }
        br.close();

    }
}
