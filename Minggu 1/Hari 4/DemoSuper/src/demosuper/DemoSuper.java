/*
 *Deskripsi: mendemonstrasikan penggunaan keyword super
             oleh suatu sub kelas untuk memanggil method yang 
             dimiliki oleh kelas induknya.
 */
package demosuper;

/**
 *
 * @author Sara Yosephina
 */
public class DemoSuper {
/*Main Method*/
    public static void main(String[] args) {
        System.out.println("DEMO 'Super' PADA INHERITANCE");
        System.out.println("--------------------------------");
        
        /*Membuat instance dari kelas anak dan memanggil 
        method yang dimilikinya*/
        KelasAnak kA = new KelasAnak();
        kA.methodAnak();
    }
    
}
