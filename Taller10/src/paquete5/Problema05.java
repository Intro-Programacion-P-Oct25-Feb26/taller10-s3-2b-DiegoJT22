/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        
        String letra;
        String nombres = "Nombres de estudiantes que tienen como  primera letra S,P,T\n";
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int col = 0; col < estudiantes[fila].length; col++) {
                letra = estudiantes[fila][col].substring(0, 1);
                if(letra.equals("S") || letra.equals("P") || letra.equals("T")){                    
                nombres = String.format("%s%s\n", nombres, estudiantes[fila][col]);
                }

            }
        }
        System.out.printf("%s",nombres);
    }

}
