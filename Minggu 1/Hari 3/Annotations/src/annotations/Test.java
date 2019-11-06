
package annotations;

/**
 *
 * @author Sara Yosephina
 */

/**
 * Mengimport package anotasi Documented, 
 * Retention and RetentionPolicy
 */
import java.lang.annotation.Documented;
import java.lang.annotation.Retention; 
import java.lang.annotation.RetentionPolicy; 
 @Documented 
@Retention(RetentionPolicy.RUNTIME) 
 
 /**
  * membuat anotasi dengan nama TestAnnotation 
  * dengan beberapa variable yaitu variable Developer dan 
  * Expirydate dengan default "Rahul" pada variable developer
  */
 @ interface TestAnnotation 
{
    String Developer() default "Rahul";
    String Expirydate();
}

/**
 * Class yang berisikan beberapa
 * anotasi dari TestAnnotation 
 */
public class Test
{
    @TestAnnotation(Developer="data", Expirydate="01-10-2020") void fun1()
    {
        System.out.println("Test method 1");
    }
    
    @TestAnnotation(Developer="fair", Expirydate="01-10-2020") void fun2()
    {
        System.out.println("Test method 2");
    }
    
    public static void main(String args[])
    {
        System.out.println("Hello");
    }
}