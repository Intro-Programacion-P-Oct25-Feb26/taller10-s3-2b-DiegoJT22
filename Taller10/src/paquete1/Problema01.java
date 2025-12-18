/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] asistenciac = new int[4];
        int contador;
        String reporte = "";

        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};

        for (int i = 0; i < asistencia.length; i++) {
            contador = 0;
            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j] == true) {
                    contador = contador + 1;
                }
            }
            asistenciac[i] = contador;

            if (asistenciac[i] == 5) {
                reporte = String.format("%s Estudiante %s asistio %d (Asitenia todos los dias)\n",
                        reporte, estudiantes[i], asistenciac[i]);
            } else {
                reporte = String.format("%s Estudiante %s asistio %d dias\n",
                        reporte, estudiantes[i], asistenciac[i]);

            }

        }
        System.out.printf("%s", reporte);
    }

}
