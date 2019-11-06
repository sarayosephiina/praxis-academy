
package generics;

/**
 *
 * @author Sara Yosephina
 * 
 * A simple Java program to show working of user defined
 * Generic classes
 */

/*we use < > to specify parameter type */
class Test<T>{
    T obj; //an object of type T is declared
    Test (T obj){
        this.obj = obj;
    }
    public T getObject(){
        return this.obj;
    }
}

/*Driver class to test above*/
class Generics1{
    public static void main(String[] args) {
        Test <Integer> iObj = new Test<Integer>(15); // instance of integer type
        System.out.println(iObj.getObject());
        
        Test <String> sObj = new Test<String> ("GeeksForGeeks"); //instance of String Type
        System.out.println(sObj.getObject());
    }
}

