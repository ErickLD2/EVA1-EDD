/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_21_arreglos_objetos;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EVA_21_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        persona[] ipersona = new persona[10];
        for (int i = 0; i < ipersona.length; i++) {
            ipersona[i]=new persona();
            System.out.println("introduce un nombre");
            String nombre= input.nextLine();
            ipersona[i].setNombre(nombre);
        }
        for (int i = 0; i < ipersona.length; i++) {
            System.out.println("nombre:"+ipersona[i].getNombre());
        }
    }

}

class persona {

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
