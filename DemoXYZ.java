/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gauravsharma
 */

 class Outer
{
    int x;
    void showA()
    {
        
             
    }
    
    
   static class Inner
    {
        int y;
        void showB()
        {
        }
    }
}
public class DemoXYZ {
    public static void main(String[] args) {
//       Outer o = new Outer();
//       Outer.Inner in = o.new Inner();
        Outer.Inner in = new Outer.Inner();
       in.showB();
       
    }
    
}
