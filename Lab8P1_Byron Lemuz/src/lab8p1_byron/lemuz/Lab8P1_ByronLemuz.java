/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_byron.lemuz;
import java.util.Arrays;
import java.util.Random;
import java. util.Scanner;

/**
 *
 * @author lesly
 */
public class Lab8P1_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner lea = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
             System.out.println("Por favor, seleccione una opción:");
            System.out.println("1. Xarray");
            System.out.println("2. Sin Duplicados");
            System.out.println("3. Oración a Matriz");
            System.out.println("4. Salir");
            opcion = lea.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un tamaño: ");
        int n = lea.nextInt();

        int[][] matriz = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(3001) + 1100; 
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        XArray xArray = new XArray(matriz);
        xArray.getDiagonales();
        int[] diagonales = xArray.getArray();

        System.out.print("Arreglo de diagonales: ");
        for (int i = 0; i < diagonales.length; i++) {
            System.out.print("[" + diagonales[i] + "]");
        }
    
 
                    break;
                case 2:
                     int tamaño;
                    do {
                        System.out.print("Ingrese un tamaño entre 5 y 10: ");
                        tamaño = lea.nextInt();
                    } while (tamaño < 5 || tamaño > 10);
                    Duplicados dup = new Duplicados(tamaño);
                    dup.llenarArreglo();
                    System.out.println("Arreglo generado: " + Arrays.toString(dup.getArreglo()));
                    dup.sDuplicados();
                    System.out.println("Arreglo sin duplicados: " + Arrays.toString(dup.getArreglo()));
                    break;

                case 3:
                    Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una oración: ");
        String oracion = sc.nextLine();
        OMatriz oMatriz = new OMatriz(oracion);
        char[][] matrix = oMatriz.getMatriz();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != '-') {
                    System.out.print("[" + matrix[i][j] + "]");
                }
            }
            System.out.println();
        }
    
                        break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default: 
                    System.out.println("La opcion que ingreso no es valida :( ");
            }
        }
    }
}
