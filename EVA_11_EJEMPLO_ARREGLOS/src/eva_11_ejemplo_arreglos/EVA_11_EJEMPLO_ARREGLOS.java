/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EVA_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("indica el tamaño del grupo:");
        int iTama= input.nextInt();
        int[] aiEdades= new int [iTama];
        for(int i= 0; i< aiEdades.length; i++){
            System.out.println("Edades:");
            aiEdades[i]=input.nextInt();
        }
        int iAcum= 0;
        for(int i= 0; i< aiEdades.length; i++){
            System.out.println("["+ aiEdades[i]+ "]");
            iAcum= iAcum + aiEdades[i];
        }
        double dProm = (double)iAcum/ (double)iTama;
        System.out.println("promedio"+ dProm);
        
    }
    
}
