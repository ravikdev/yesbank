/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gauravsharma
 */
interface Inter1 {
    int x=90;
    public void fun1();
    public void fun2();
    public void fun3();
}

interface Inter2 
{
    public void fun4();
    public void fun5();
}

class B {

    void show() {
        System.out.println("Class B show");
    }
}

class A1 extends B implements Inter1,Inter2 {

    @Override
    public void fun1() {
        show();
        System.out.println("Fun1" + Inter1.x);
    }

  
    @Override
    public void fun3() {
        System.out.println("Fun3");
    }

    @Override
    public void fun4() {
        System.out.println("Fun4");
    }

    @Override
    public void fun5() {
        System.out.println("Fun5");
    }

    @Override
    public void fun2() {
        throw new UnsupportedOperationException(""); //To change body of generated methods, choose Tools | Templates.
    }
}

public class DemoInterface {

    public static void main(String[] args) {
        A1 i1 = new A1();
        i1.fun1();
        i1.fun2();
        i1.fun3();
        i1.fun4();
        i1.fun5();
    }
}
