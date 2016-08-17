/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author gauravsharma
 */
public class DemoFileOutBytes {

    public static void main(String[] args) throws Exception {

        String data = "i am fine jzsdjgh9gdsfgdjkg";
        File f1 = new File("C:\\java\\file2.txt");
        FileOutputStream fs = new FileOutputStream(f1);
        OutputStreamWriter os = new OutputStreamWriter(fs);
        byte b[] = data.getBytes();
        for (int i = 0; i < b.length; i++) {
            os.write(b[i]);
        }
        os.close();
    }
}
