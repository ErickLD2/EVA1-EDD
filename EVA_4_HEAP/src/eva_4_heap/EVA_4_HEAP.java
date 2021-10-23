/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_4_heap;

/**
 *
 * @author PC
 */
public class EVA_4_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MiClase obj=new MiClase();
        System.out.println(obj);
        MiClase obj2=new MiClase();
        System.out.println(obj2);
        EVA_4_HEAP objheap= new EVA_4_HEAP();
        System.out.println(objheap);
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

  
