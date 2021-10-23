/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EVA_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("introduce el numero:");
        int iVal=input.nextInt();
        boolean esprimo= false;
        for(int i=2; i<iVal; i++){
            int iMod= iVal%1;
            if(iMod ==0) {
                esprimo= false;
                break;
            }
        }
        if(esprimo)
            System.out.println("el numero es primo");
        else
            System.out.println("el numero no es primo");
    }
    
}
