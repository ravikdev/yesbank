/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gauravsharma
 */
abstract class Shape {
int a,b;
    abstract void area();

    abstract void color();

    void angle() {
    }
}

class Tr extends Shape {

    @Override
    void area() {

        System.out.println("Area of Tr is 789");
    }

    @Override
    void color() {
        System.out.println("Color of Tr is Blue");
    }

    @Override
    void angle() {
        System.out.println("Tr has 3 angles");
    }
}

class Cr extends Shape {

    @Override
    void area() {
        System.out.println("Area of Cr is 456");
    }

    @Override
    void color() {
        System.out.println("Color of Cr is Red");
    }
}

public class DemoAbs {

    public static void main(String[] args) {
        Shape s1 = new Tr();
        s1.angle();
        s1.area();
        s1.color();
        s1 = new Cr();
        s1.area();
        s1.color();
    }
}
