/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorIngresado;
        int[][] matrizA = new int[5][6];
        int[][] matrizB = new int[5][6];
        int[][] matrizC = new int[5][6];
        int valor1 = 0;
        int valor2 = 0;
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
                matrizB[i][j] = valorIngresado;
            }
            System.out.println();
        }
        System.out.println("MATRIZ A");
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                System.out.printf("%d\t", matrizA[fila][col]);
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("MATRIZ B");
        for (int fila = 0; fila < matrizB.length; fila++) {
            for (int col = 0; col < matrizB[fila].length; col++) {
                System.out.printf("%d\t", matrizB[fila][col]);
            }
            System.out.println("");
        }

        for (int fila = 0; fila < matrizA.length; fila++) {

            for (int col = 0; col < matrizA[fila].length; col++) {
                valor1 = matrizA[fila][col];
                valor2 = matrizB[fila][col];
                matrizC[fila][col] = valor1 * valor2;

            }
        }

        System.out.println("MATRIZ C productos elementos A y B");
        for (int fila = 0; fila < matrizC.length; fila++) {
            for (int col = 0; col < matrizC[fila].length; col++) {
                System.out.printf("%d\t", matrizC[fila][col]);
            }
            System.out.println("");
        }

    }

}

