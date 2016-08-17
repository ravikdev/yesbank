/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gauravsharma
 */
class A {

   
   
    
    A() {
        System.out.println("Class A con");
    }

    void show() {
        int x;
        System.out.println("class A show");
    }

    static {
        System.out.println("Class A static block");
    }
}

public class DemoIn {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A obj2 = new A();
        obj2.show();

    }
}
