
package ekspresiemosional;

/**
 *
 * @author Sara Yosephina
 */
public class EkspresiEmosional {

    public static void main(String[] args) {
        System.out.println("\tDEMO POLIMORPHYSM");
        System.out.println("-------------------------------------");
        
        /*Membuat object-object ekspresi dari wajah*/
        EkspresiWajah objEkspresi = new EkspresiWajah();
        Gembira objGembira = new Gembira();
        Sedih objSedih = new Sedih();
        Marah objMarah = new Marah();
        
        /*Menyatakan objek-objek ekspresi tersebut
        menjadi suatu daftar ekspresi*/
        EkspresiWajah[] ekspresi = new EkspresiWajah[4];
        ekspresi [0] = objEkspresi;
        ekspresi [1] = objGembira;
        ekspresi [2] = objSedih;
        ekspresi [3] = objMarah;
        
        /*Polimorphysm membuat EkspresiWajah menjadi terlihat
        memiliki beberapa tingkah laku/kondisi yang berbeda-beda*/
        System.out.println("Ekspresi [0]: " + ekspresi[0].respons());
        System.out.println("Ekspresi [1]: " + ekspresi[1].respons());
        System.out.println("Ekspresi [2]: " + ekspresi[2].respons());
        System.out.println("Ekspresi [3]: " + ekspresi[3].respons());
    }
    
}
