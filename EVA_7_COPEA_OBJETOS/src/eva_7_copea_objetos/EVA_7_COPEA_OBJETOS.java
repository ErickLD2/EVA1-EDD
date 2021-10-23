/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_7_copea_objetos;

/**
 *
 * @author PC
 */
public class EVA_7_COPEA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        prueba obj=new prueba();
        System.out.println(obj);
        prueba obj2=obj;
        System.out.println(obj2);
        System.out.println("valor de la x=" +obj.x);
        obj2.x++;
        System.out.println("valor de la x=" + obj.x);   
    }
    
}
class prueba{
    int x=10;
}
