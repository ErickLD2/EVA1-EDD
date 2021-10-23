/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_18_promedios;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EVA_18_PROMEDIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] aiGrupos;
        System.out.println("cuantos grupos son?");
        int iNoGrupos=input.nextInt();
        aiGrupos=new int[iNoGrupos][];
        for(int i=0; i<aiGrupos.length; i++){
            System.out.println("para el grupo "+ i + "cuantos estudiantes son?");
              int iNoEst=input.nextInt();
              aiGrupos[i]=new int[iNoEst];
        }
        for(int i=0; i<aiGrupos.length; i++){
            for(int j=0; j<aiGrupos[i].length; j++){
               System.out.println("["+"]");
            }
        }
        System.out.println("");
    }
    
}
