package vectordemo;
import java.util.*;
/**
 *
 * @author sara yosephina
 */
public class VectorDemo {
    
    public static void main(String[] args) {
       /*initial size is 3, increment is 2 */
        Vector v = new Vector(3,2);
        System.out.println("intial size: " + v.size());
        System.out.println("initial capacity: " + v.capacity());
        
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("capacity after four additions: " + v.capacity());
        
        v.addElement(new Double(5.45));
        System.out.println("current capacity: " + v.capacity());
        
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("current capacity: " + v.capacity());
        
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("current capacity: " + v.capacity());
        
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First Element: " + (Integer)v.firstElement());
        System.out.println("Last Element: " + (Integer)v.lastElement());
        
        if (v.contains(new Integer(3)))
            System.out.println("vector contains 3.");
        
        /*enumerate the elements in the vector*/
        Enumeration vEnum = v.elements();
        System.out.println("elements in vector");
        
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
        
    }
    
}
