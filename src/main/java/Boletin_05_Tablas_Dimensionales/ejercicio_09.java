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
public class ejercicio_09 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int t[][][];
        int i,j,k;
        t = new int[9][9][9];
        
        for (i=0;i<9;i++){
            for (j=0;j<9;j++){
                for (k=0;k<9;k++){
                    if(i==0 || i==8 || j==0 || j==8 || k==0 || k==8){
                        // si estamos en la primera o última columna, fila o capa de la matriz
                        t[i][j][k]=1;
                    }
                }
            }
        }
        // Mostramos la matriz capa a capa
        System.out.println("Matriz: ");
        for (i=0;i<9;i++){
            System.out.println("Capa: " +i);
            for (j=0;j<9;j++){
                for (k=0;k<9;k++){
                    System.out.print(t[i][j][k] + " ");
                }
                System.out.println ();
            }
            System.out.println (" -------------- ");
        }
    }
}
