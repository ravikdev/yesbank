/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pack1;

/**
 *
 * @author gauravsharma
 */
public class DemoThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
        }
    }
    public static void main(String[] args) {

        DemoThread2 t1 = new DemoThread2();
        DemoThread2 t2 = new DemoThread2();
        t1.start();
        t2.start();

    }
}
