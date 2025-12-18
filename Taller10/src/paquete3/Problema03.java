/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        int contadorfallo;
        int contador = 0;
        String reporte = "";
        int zonasSinFallos = 0;
        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}};

        for (int i = 0; i < sensores.length; i++) {
            contadorfallo = 0;
            for (int j = 0; j < sensores[i].length; j++) {
                if (sensores[i][j] == false) {
                    contadorfallo = contadorfallo + 1;
                } else {
                    contador = contador + 1;
                }
            }
            if (contador == sensores[i].length) {
                zonasSinFallos = zonasSinFallos + 1;
            } else {
                System.out.printf(
                        "La zona %d presenta al menos un fallo\n",
                        i + 1);
            }
        }

        System.out.printf(
                "Zonas que funcionan sin fallos: %d\n",
                zonasSinFallos);

    }
}
