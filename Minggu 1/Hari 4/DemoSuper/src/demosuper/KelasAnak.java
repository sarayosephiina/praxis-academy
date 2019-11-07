
package demosuper;

/**
 *
 * @author user
 */
class KelasAnak extends KelasInduk{
    //konstructor kelas anak memanggil konstruktor kelas induk
    public KelasAnak(){
        super();
    }
    
    /*method yang memanggil MethodInduk dari kelas induknya
    dengan menggunakan keyword super
    */
    public void methodAnak(){
        super.MethodInduk();
    }
    
}
