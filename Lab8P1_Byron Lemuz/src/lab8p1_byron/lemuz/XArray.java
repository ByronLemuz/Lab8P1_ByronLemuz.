/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_byron.lemuz;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author lesly
 */
public class XArray {
    private int[][] matriz;
    private int[] diagonales;

    public XArray(int[][] matriz) {
        this.matriz = matriz;
        this.diagonales = new int[matriz.length * 2 - 1];
    }

    XArray(int tam) {
           }

    public void getDiagonales() {
        int index = 0;
        for (int i = 0; i < matriz.length; i++) {
            diagonales[index++] = matriz[i][i]; // diagonal principal
            if (i != matriz.length - 1) {
                diagonales[index++] = matriz[i][matriz.length - 1 - i]; // diagonal secundaria
            }
        }
    }

    public int[] getArray() {
        return diagonales;
    }

    
    }

   
        



