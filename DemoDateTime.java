/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author gauravsharma
 */
public class DemoDateTime {
    
    public static void main(String[] args) {
        
        String months[] = {"jan","feb","march","april","May","June","July"};
        
        GregorianCalendar gc = new GregorianCalendar();
        
        System.out.print(gc.get( Calendar.DATE )+"/");
        System.out.print(gc.get(Calendar.YEAR)+"/");
        System.out.println(   months[gc.get(Calendar.MONTH)]     );
        
        System.out.print(gc.get(Calendar.HOUR)+": ");
        System.out.print(gc.get(Calendar.MINUTE)+": ");
        System.out.println(gc.get(Calendar.SECOND));
        System.out.println(gc.isLeapYear(2016));
        
    }
    
    
}
