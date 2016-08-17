/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gauravsharma
 */
public class DemoFun {

    void sum(int a, int b ) 
    {
        int  c;
        c = a + b;
        System.out.println("Sum is : " + c);
    }
    
    void sum(float a, float b ) 
    {
        float  c;
        c = a + b;
        System.out.println("Sum is : " + c);
    }

    public static void main(String[] args) {
        DemoFun obj = new DemoFun();
        obj.sum(23,34);
        obj.sum(23.45f,34.45f);
    }
}
