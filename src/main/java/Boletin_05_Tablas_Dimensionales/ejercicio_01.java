/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_05_Tablas_Dimensionales;

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_01 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int t[][]; // definimos t como una tabla bidimensional
        t = new int [5][5]; // creamos la tabla de 5x5
        for (int i=0;i<5;i++){ // utilizamos i para la primera dimensión
            for (int j=0;j<5;j++){ // utilizamos j para la segunda dimensión
                t[i][j]=i+j;
            }
        }
        
        System.out.println("TABLA: ");

        for (int i=4;i>=0;i--){
            System.out.println();
            for (int j=0;j<5;j++){
                System.out.print(t[i][j]+" ");
            }
        }
    }
}
