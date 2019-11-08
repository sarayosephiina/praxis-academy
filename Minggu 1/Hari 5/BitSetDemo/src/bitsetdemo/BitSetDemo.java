package bitsetdemo;
import java.util.BitSet;
/**
 *
 * @author sara yosephina
 */
public class BitSetDemo {

    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);
        
        /*set some bits*/
        for (int i = 0; i <16; i++){
            if((i % 2) == 0 ) bits1.set(i);
            if((i % 5) != 0 ) bits2.set(i);
        }
        
        System.out.println("initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println();
        System.out.println("initial pattern in bits2: ");
        System.out.println(bits2);
        System.out.println();
        
        /*AND bits*/
        bits2.and(bits1);
        System.out.println("bits2 AND bits1: ");
        System.out.println(bits2);
        System.out.println();
        
        /*OR bits*/
        bits2.or(bits1);
        System.out.println("bits2 OR bits1: ");
        System.out.println(bits2);
        System.out.println();
        
        /*XOR bits*/
        bits2.xor(bits1);
        System.out.println("bits 2 XOR bits1: ");
        System.out.println(bits2);
    }
    
}
