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
public class ejercicio_08 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int i,j;
        int t[][]; 

        t = new int[8][6]; // se inicializa toda la tabla a 0.
        // rellenamos la matriz marco
        for (i=0;i<8;i++){
            for (j=0;j<6;j++){
                if(i==0 || i==7){ // si nos encontramos en la primera o última columna
                    t[i][j]=1;
                }
                if(j==0 || j==5){ // si nos encontramos en la primera o última fila
                    t[i][j]=1;
                }
            }
        }

        System.out.print("Matriz marco: ");
        
        for (i=0;i<8;i++){
            System.out.println();
            for (j=0;j<6;j++){
                System.out.print (t[i][j]+" ");
            }
        }
        System.out.println ();
    }
}
