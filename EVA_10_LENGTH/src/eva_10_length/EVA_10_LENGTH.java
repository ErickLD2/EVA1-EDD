/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_10_length;

/**
 *
 * @author PC
 */
public class EVA_10_LENGTH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aiDatos= new int[100];
        System.out.println("tamaño del arreglo:" +aiDatos.length);
        System.out.println(aiDatos);
         System.out.println(args);
         double[] algo=new double[100];
         System.out.println(algo);
        for(int i=0; i<aiDatos.length; i++){
             aiDatos[i] = (int) (Math.random() * 100);
        }
         for(int i=0; i<aiDatos.length; i++){
             System.out.print("["+ aiDatos.length + "]");
         }
    }
    
}
