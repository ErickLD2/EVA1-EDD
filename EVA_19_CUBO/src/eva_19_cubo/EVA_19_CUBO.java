/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_19_cubo;

/**
 *
 * @author PC
 */
public class EVA_19_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int icubo[][][]= new int [3][4][2];
       for(int i=0; i<icubo.length; i++){
           for(int j=0; j<icubo[i].length; j++){
               for(int k=0; k<icubo[i][j].length; k++){
                   icubo[i][j][k]=100;
               }
           }
       }
    }
    
}
