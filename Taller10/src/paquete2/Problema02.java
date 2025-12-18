/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        

        int contador;
        int mayoresEdad = 0;
        int menoresEdad = 0;
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}};
        
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                if (edades[i][j] >= 18) {
                    mayoresEdad = mayoresEdad + 1;
                }if (edades[i][j] < 18)
                    menoresEdad= menoresEdad + 1;
                }
                
            }
        System.out.printf("Mayores de edad dentro de las familias: %d \n"
                + "Menores de edad dentro de las familias: %d \n",mayoresEdad,menoresEdad);

        
    }

}
