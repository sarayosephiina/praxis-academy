
package demoenkapsulasi;

/**
 *
 * @author Sara Yosephina
 */

class HitungGaji {
    
    /*Mendeklarasikan variabel-variabel internal kelas HitungGaji.
    variabel potongan menyatakan dana untuk asuransi kesehatan(askes),
    iura koperasi, cicilan kendaraan dan sebagainya.
    Hanya variable gajiKotor dan gajiBersih yang dapat diakses oleh "lingkungan luar"
    */
   
    private double gajiKotor;
    private double gajiBersih;
    private double gajiSetelahPajak;
    private double potongan = 75000.00;
    
    /*Method untuk mengeset variabel internal gajiKotor*/
    public void setGaji(double gaji){
        gajiKotor = gaji;
    }
    
    /*Method untuk menghitung gaji bersih*/
    public void hitungGaji(){
        gajiSetelahPajak = gajiKotor - (0.2 * gajiKotor);
        gajiBersih = gajiSetelahPajak - potongan;
    }
    
    /*Method untuk mengembalikan gaji kotor*/
    public double getGajiKotor(){
        return gajiKotor;
    }
    
    /*Method yang mengembalikan besar gaji bersih*/
    public double getGajiBersih(){
        return gajiBersih;
    }
}
