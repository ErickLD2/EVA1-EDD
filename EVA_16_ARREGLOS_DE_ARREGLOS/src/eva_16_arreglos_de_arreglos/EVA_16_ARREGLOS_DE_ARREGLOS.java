/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_16_arreglos_de_arreglos;

/**
 *
 * @author PC
 */
public class EVA_16_ARREGLOS_DE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] iMatriz= new int[3][3];
        System.out.println("direccion del arreglo:" + iMatriz);
        System.out.println("tamaño de la primer dimension(filas):"+ iMatriz.length);
      for(int i=0; i<iMatriz.length; i++){
          System.out.println("Matriz["+ i+ "]"+ iMatriz[i]);
          
      }
    }
    
    
}
