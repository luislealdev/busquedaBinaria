import java.util.Scanner;

public class p145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v_limInferior = 0;
        int v_limSuperior = 0;
        int v_numABuscar = 0;
        int v_puntoMedio;
        boolean bandera = true;
        // Ciclo para leer siguientes lineas
        while (bandera) {
            try {
                v_limInferior = sc.nextInt();
                v_limSuperior = sc.nextInt();
                v_numABuscar = sc.nextInt();

                // Salir si se leen 3 ceros
                if (v_limInferior == 0 && v_limSuperior == 0 && v_numABuscar == 0)
                    bandera = false;

            } catch (Exception E) {
                bandera = false;
            }
            if (bandera) {
                // Cosas a realizar
                // Mostrar -1 si el dato no está en el rango
                if (v_numABuscar < v_limInferior || v_numABuscar > v_limSuperior)
                    System.out.println("-1");
                else {
                    int v_contador = 1;
                    v_puntoMedio = (v_limInferior + v_limSuperior) / 2;

                    while (v_limInferior != v_limSuperior) {
                        if (v_numABuscar > v_puntoMedio) {
                            v_limInferior = v_puntoMedio + 1;
                        } else {
                            v_limSuperior = v_puntoMedio;
                        }
                        v_puntoMedio = (v_limInferior + v_limSuperior) / 2;
                        v_contador++;
                    }
                    // while (v_puntoMedio != v_numABuscar && v_limInferior < v_limSuperior) {
                    // if (v_puntoMedio > v_numABuscar) {
                    // v_limSuperior = v_puntoMedio;
                    // } else {
                    // v_limInferior =v_puntoMedio;
                    // }
                    // v_puntoMedio = (v_limInferior + v_limSuperior) / 2;
                    // v_contador++;
                    // }
                    System.out.println(v_contador);
                }
            }
            ;
        } // Fin del ciclo
        sc.close();
    }

}