/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_13_arreglos;

/**
 *
 * @author PC
 */
public class EVA_13_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] iArreglo = new int[3];
        System.out.println("Direccion del arreglo" + iArreglo);
        iArreglo[0] = 0;
        iArreglo[1] = 1;
        iArreglo[2] = 2;
        //iArreglo[3]= 3;
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("cuenta" + i + "=$" + iArreglo[i]);
        }
        int[] icopia= iArreglo;
        System.out.println("Direccion del arreglo" + icopia);
         for (int i = 0; i < icopia.length; i++) {
            System.out.println("cuenta" + i + "=$" + icopia[i]);
        }
          iArreglo = new int[2];
        System.out.println("direccion del arreglo modificado"+ iArreglo);
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("cuenta modificada" + i + "=$" + iArreglo[i]);
        }
       System.out.println("Direccion del arreglo" + icopia);
        for (int i = 0; i < icopia.length; i++) {
            System.out.println("cuenta" + i + "=$" + icopia[i]);
        }
    }
    
}
