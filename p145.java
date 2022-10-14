import java.util.Scanner;

public class p145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v_limInferior = 0;
        int v_limSuperior = 0;
        int v_numABuscar = 0;

        double v_puntoMedio;

        // int v_contador = 0;

        boolean bandera = true;
        while (bandera) {
            try {
                v_limInferior = sc.nextInt();
                v_limSuperior = sc.nextInt();
                v_numABuscar = sc.nextInt();

                if(v_limInferior==0 && v_limSuperior==0&&v_numABuscar==0) bandera=false;
            } catch (Exception E) {
                bandera = false;
            }
            if (bandera) {
                // Cosas a realizar
                v_puntoMedio = ((v_limInferior + v_limSuperior) / 2);
                System.out.println("Punto medio:" + v_puntoMedio);
                // if(v_numABuscar>v_puntoMedio)
            }
            ;
        } // Fin del ciclo
        sc.close();

    }
}