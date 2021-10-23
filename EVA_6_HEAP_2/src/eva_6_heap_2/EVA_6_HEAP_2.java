/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_6_heap_2;

/**
 *
 * @author PC
 */
public class EVA_6_HEAP_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valOrig=5;
       System.out.println("valOrig en main=" + valOrig);
       valOrig=incrementaquesifunciona(valOrig);
       System.out.println("valOrig despues de llamar a incrementar" + valOrig);
       
       prueba objprueba= new prueba();
       System.out.println("valor de la x=" + objprueba.x);
       System.out.println("objprueba en el main="+objprueba);
       incrementaobj(objprueba);
        System.out.println("valor de la x despues de inrementa=" + objprueba.x);
    }
    
    public static void incrementa(int val){
        val++;
         System.out.println("valor en incrementa = " + val);
    }
    public static int incrementaquesifunciona(int val){
        return val++;
    
    }
    public static void incrementaobj(prueba val){
        System.out.println("objeto en incrementaobj"+val);
        val.x++;
    }
    
    
}
class prueba{
        public int x=10;
    }
