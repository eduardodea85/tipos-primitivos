/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "Eduardo";
        float nota = 8.5f;
        System.out.println("A nota é " + nota);
        System.out.printf("A nota é %.2f \n", nota);
        System.out.printf("A nota de %s é %.4f \n", nome, nota);
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }
    
}
