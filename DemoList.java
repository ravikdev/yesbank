/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author gauravsharma
 */
public class DemoList {

    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Double d1 = new Double(56.23);
        String str1 = "hello";
        Float f1 = new Float(47.23);
        Integer i2 = new Integer(10);
        List l1 = new ArrayList();
        l1.add(i1);
        l1.add(d1);
        l1.add(str1);
        l1.add(f1);
        l1.add(i2);
        l1.isEmpty();
        System.out.println(l1);
    }
}