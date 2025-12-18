/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorIngresado;
        int[][] matrizA = new int[3][2];
        int[][] matrizB = new int[3][2];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Ingrese valor para la posición de la primera matriz [%d][%d]\t:",
                        i, j);
                valorIngresado = entrada.nextInt();
                matrizA[i][j] = valorIngresado;
            }
            System.out.println();
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("Ingrese valor para la posición de la segunda matriz [%d][%d]\t:",
                        i, j);
                valorIngresado = entrada.nextInt();
                matrizA[i][j] = valorIngresado;
            }
            System.out.println();
        }
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                System.out.printf("%d\t", matrizA[fila][col]);
            }
            System.out.println("");
        }
        for (int fila = 0; fila < matrizB.length; fila++) {
            for (int col = 0; col < matrizB[fila].length; col++) {
                System.out.printf("%d\t", matrizB[fila][col]);
            }
            System.out.println("");
        }
    }
}
