package Programas;
import java.util.Scanner;  
public class Programa01 {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
       // matriz de ventas de 4x4  
        double[][] ventas = new double[4][4]; 
        
       // Proceso de registro de ventas  
        for (int i = 0; i < 4; i++) {  
            for (int j = 0; j < 4; j++) {  
                System.out.print("Ingrese la venta para la fila " + (i + 1) + ", columna " + (j + 1) + ": ");  
                ventas[i][j] = scanner.nextDouble();  
            }  
        }  

        // Calcular y visualizar el total de las ventas  
        double totalVentas = 0;  
        for (int i = 0; i < 4; i++) {  
            for (int j = 0; j < 4; j++) {  
                totalVentas += ventas[i][j];  
            }  
        }  

        System.out.println("El total de las ventas es: " + totalVentas);  
        
        // Cerrar el escáner  
        scanner.close();  
    }  
}