package Programas;
import java.util.Scanner;  
public class Programa02 {
public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        double[][] compras = new double[4][4]; // matriz de compras de 4x4  
        double totalCompras = 0;  
        int cantidadCompras = 0;  

        // Proceso de registro de compras  
        for (int i = 0; i < 4; i++) {  
            for (int j = 0; j < 4; j++) {  
                System.out.print("Ingrese la compra para la fila " + (i + 1) + ", columna " + (j + 1) + ": ");  
                compras[i][j] = scanner.nextDouble();  
                totalCompras += compras[i][j]; // Sumar a total  
                if (compras[i][j] > 0) {  
                    cantidadCompras++; // Contar compras válidas  
                }  
            }  
        }  

        // Calcular el promedio  
        double promedioCompras = cantidadCompras > 0 ? totalCompras / cantidadCompras : 0;  

        // Visualizar resultados  
        System.out.println("El total de las compras es: " + totalCompras);  
        System.out.println("El promedio de las compras es: " + promedioCompras);  
        
        // Cerrar el escáner  
        scanner.close();  
    }  
}  