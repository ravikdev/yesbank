/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gauravsharma
 */
class Table {
    
  synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            
            System.out.println(n * i);
        }
        
    }
}

class MyThread1 extends Thread {
    Table t;
    public MyThread1(Table t) {
        this.t = t;
    }
    @Override
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;
    public MyThread2(Table t) {
        this.t = t;
    }
    @Override
    public void run() {
        t.printTable(10);
    }
}

public class DemoThreadMulti {
    
    public static void main(String[] args) {
        Table t1 = new Table();
        MyThread1 thread1 = new MyThread1(t1);
        thread1.start();
        
        MyThread2 thread2 = new MyThread2(t1);
        thread2.start();
    }
}
