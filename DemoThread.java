/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gauravsharma
 */
public class DemoThread {

    public static void main(String[] args) {
        //Data1 d1  =new Data1();
        Thread t1 = new Thread(new Data1());//Data 1 is class
        Thread t2 = new Thread(new Data2());
        Thread t3 = new Thread(new Data3());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

class Data1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread-1 : " + i);

        }
        
    }
}

class Data2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread-2 : " + i);

        }
    }
}

class Data3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread-3 : " + i);

        }
    }
}
