/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author daigo
 */
public class Problema07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valorIngresado;
        int[][] matrizX = new int[3][3];
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int valordiferente = 0;
        int mayor = 0;
        int mayorIgual = 0;
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[i].length; j++) {
                System.out.printf("Ingrese valor para la posición de la matriz X [%d][%d]\t:",
                        i, j);
                valorIngresado = entrada.nextInt();
                matrizX[i][j] = valorIngresado;
            }
            System.out.println();
        }

        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int col = 0; col < matrizX[fila].length; col++) {
                matrizA[fila][col] = (matrizX[fila][col] + 1) * (matrizX[fila][col] + 1);
                matrizB[fila][col] = (matrizX[fila][col]) * matrizX[fila][col] + 2 * matrizX[fila][col] + 1;

            }
        }
        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int col = 0; col < matrizX[fila].length; col++) {
                if (matrizA[fila][col] != matrizB[fila][col]) {
                    valordiferente = valordiferente + 1;
                }

            }
        }
        if (valordiferente > 0) {
            System.out.printf("La identidad algebraica no se cumple");
        } else {
            System.out.printf("La identidad algebraica se cumple");
        }
    }

}
