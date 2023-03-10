/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_byron.lemuz;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author lesly
 */
public class Duplicados {
    private int[] arreglo;

    public Duplicados(int tamaño) {
        arreglo = new int[tamaño];
    }

    public void llenarArreglo() {
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(10) + 1;
        }
    }

    public void sDuplicados() {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    arreglo[j] = 0;
                }
            }
        }
    }

    public int[] getArreglo() {
        return arreglo;
    }
}


