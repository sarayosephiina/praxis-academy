
package demoenkapsulasi;
import java.text.DecimalFormat;

/**
 *
 * @author Sara Yosephina
 */
public class DemoEnkapsulasi {

    public static void main(String[] args) {
        
       /*Mengeset tampilan hasil menjadi dua digit desimal*/
        DecimalFormat digitPresisi = new DecimalFormat("0.00");
        System.out.println("DEMO ENCAPSULASI");
        System.out.println("------------------");
        
        /*Membuat instans dari kelas hitungGaji untuk suatu pegawai, dan memanggil
        method-methodnya*/
        HitungGaji tony = new HitungGaji();
        tony.setGaji(2500000);
        tony.hitungGaji();
        
        System.out.println("\tInformasi Gaji Pegawai");
        System.out.println();
        System.out.println("Besar Gaji Kotor:\t\t " + digitPresisi.format(tony.getGajiKotor()));
        System.out.println("Besar Gaji yang dibawa Pulang:   " + digitPresisi.format(tony.getGajiBersih()));
    }
    
}


