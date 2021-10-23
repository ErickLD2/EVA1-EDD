/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_5_garbage_collector;

/**
 *
 * @author PC
 */
public class EVA_5_GARBAGE_COLLECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MiClase obj=new MiClase();
       System.out.print(obj);
       obj=null;
       System.out.print(obj);
    }
    
}
class MiClase {

            private String mesnaje;

            public MiClase() {
                mesnaje = "hola mundo";
            }

            public String getMesnaje() {
                return mesnaje;
            }

            public void setMesnaje(String mesnaje) {
                this.mesnaje = mesnaje;
            }

        }