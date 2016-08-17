/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gauravsharma
 */
public class DemoSet {
    public static void main(String[] args) {
        
        Integer i1 = new Integer(10);
        Double d1 = new Double(56.23);
        String str1 = "hello";
        Float f1 = new Float(47.23);
        Integer i2 = new Integer(10);
        
        Set s1 = new HashSet();
        s1.add(i1);
        s1.add(d1);
        s1.add(str1);
        s1.add(f1);
        s1.add(i2);
        System.out.println(s1);
    }
    
}
