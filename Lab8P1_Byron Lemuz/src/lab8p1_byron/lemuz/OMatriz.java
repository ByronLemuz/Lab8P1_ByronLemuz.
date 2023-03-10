/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_byron.lemuz;
import java.util.Scanner;
/**
 *
 * @author lesly
 */
public class OMatriz {
    private char[][] matriz;

    public OMatriz(String oracion) {
        String[] palabras = oracion.split(" ");
        int filas = palabras.length;
        int columnas = 0;
        for (int i = 0; i < filas; i++) {
            if (palabras[i].length() > columnas) {
                columnas = palabras[i].length();
            }
        }
        this.matriz = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                matriz[i][j] = palabra.charAt(j);
            }
            for (int j = palabra.length(); j < columnas; j++) {
                matriz[i][j] = '-';
            }
        }
    }

    public char[][] getMatriz() {
        return matriz;
    }
}


