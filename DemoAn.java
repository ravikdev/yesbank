/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import sun.awt.windows.ThemeReader;

/**
 *
 * @author gauravsharma
 */
public class DemoAn {

    public static void main(String[] args) {
        Thread t1 = new Thread(
                new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                }
            }
        });
        t1.start();
    }
}
