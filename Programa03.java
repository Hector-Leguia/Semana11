package Programas;
import java.util.Random; 
public class Programa03 {
  public static void main(String[] args) {
        Random random = new Random();

        // Matriz de 4x4 para almacenar las ventas
        int[][] ventas = new int[4][4];
        
        // Llenar la matriz con valores aleatorios entre 10 y 5000 y mostrar los valores
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = 10 + random.nextInt(4991);
        // Generar ventas aleatorias entre 10 y 5000
                System.out.println("Venta en posición [" + i + "][" + j + "]: " + ventas[i][j]);
            }
        }

        // Inicializar ventaMayor y ventaMenor con el primer elemento de la matriz
        int ventaMayor = ventas[0][0];
        int ventaMenor = ventas[0][0];

        // Encontrar la venta mayor y menor en la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
        }

        // Mostrar los resultados
        System.out.println("\nLa venta mayor es: " + ventaMayor);
        System.out.println("La venta menor es: " + ventaMenor);
    }
}