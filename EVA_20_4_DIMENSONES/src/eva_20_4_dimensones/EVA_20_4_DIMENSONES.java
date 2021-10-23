/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_20_4_dimensones;

/**
 *
 * @author PC
 */
public class EVA_20_4_DIMENSONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][][][] itese= new int [5][3][2][6];
        for(int i=0; i<itese.length; i++){
            for(int j=0; j<itese[i].length; j++){
                for(int k=0; k<itese[i][j].length; k++){
                    for(int l=0; l<itese[i][j][k].length; l++){
                        itese [i][j][k][l]=100;
                    }
                }
            }
        }
 
    }
    
    
}
