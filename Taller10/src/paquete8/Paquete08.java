/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author daigo
 */
public class Paquete08 {
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        int[][] dato1 = {{1, 2, 3},{6, 8, 9}};
        int[][] dato2 = {{10, 1, 2},{10, 9, 1}};
        int[][] dato3 = new int [2][3];
        int valorMenor;
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
            1   1   2
            6   8   1
        */
        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                if(dato1[i][j] < dato2[i][j]){
                    valorMenor = dato1[i][j];
                    dato3[i][j] = valorMenor;
                }else{
                    valorMenor = dato2[i][j];
                    dato3[i][j] = valorMenor;
                }

            }

        }
        System.out.println("\n-----------------");
        
        for (int i = 0; i < dato3.length; i++) {
            for (int j = 0; j < dato3[i].length; j++) {
                System.out.printf("%s\t",dato3[i][j]);
                
            }
            System.out.println("\n-----------------");
        }
        
    }
    
}
