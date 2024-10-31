package Programas;
import java.util.Random;
public class Programa04 {
    public static void main(String[] args) {
        Random random = new Random();

        // Matriz de 3x3 para almacenar las ventas
        int[][] ventas = new int[3][3];
        int totalVentas = 0;

        // Generar ventas aleatorias y asignarlas a la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = 1000 + random.nextInt(9001); 
        // Generar ventas entre 1000 y 10000
                System.out.println("Venta en posicion [" + i + "][" + j + "]: " + ventas[i][j]);
                totalVentas += ventas[i][j]; 
            }
        }

        // Calcular el promedio de las ventas
        double promedioVentas = (double) totalVentas / (3 * 3);

        // Mostrar el total y el promedio de las ventas
        System.out.println("El total de las ventas es: " + totalVentas);
        System.out.println("El promedio de las ventas es: " + promedioVentas);
    }
}