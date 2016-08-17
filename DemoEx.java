/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gauravsharma
 */
public class DemoEx {

    public static void main(String[] args) {

        try {
            int a, b, c;
            a = 10;
            b = 0;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException a) {
            System.out.println("U r /ing a no. by 0");
        }
        finally
        {
            System.out.println("Finally");
        }
        
        
        System.out.println("hello");

    }
}
