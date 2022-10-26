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
public class ejercicio_07 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int a[][], b[][];

        int i,j;

        a = new int[5][9];
        b = new int [9][5];
        for (i=0;i<5;i++){
            for (j=0;j<9;j++){
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                a[i][j]=Entrada.nextInt();
                // si queremos ahorrarnos introducir 5x9 (45) números, podemos comentar las
                // dos lineas anteriores y utilizar (por ejemplo):
                // a[i][j] = 10*i+j;
            }
        }
        
        // trasponemos
        for (i=0;i<5;i++){
            for (j=0;j<9;j++){
                b[j][i] = a[i][j];
            }
        }
        
        // mostramos la matriz traspuesta
        System.out.println("Matriz traspuesta");
        for (i=0;i<9;i++){
            for (j=0;j<5;j++){
                System.out.print (b[i][j] + " ");
                System.out.println ();
            }
        }
    }
}
