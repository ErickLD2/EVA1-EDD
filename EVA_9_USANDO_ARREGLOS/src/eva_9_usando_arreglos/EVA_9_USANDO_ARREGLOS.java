/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_9_usando_arreglos;

/**
 *
 * @author PC
 */
public class EVA_9_USANDO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aiDatos = new int[10];

        for (int i = 0; i < 10; i++) {
            aiDatos[i] = (int) (Math.random() * 100);
        }

        /*aiDatos[0]=50;
      aiDatos[1]=100;
      aiDatos[2]=200;
      System.out.println(aiDatos[0]);*/
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + aiDatos[i] + "]");
        }
    }

}
