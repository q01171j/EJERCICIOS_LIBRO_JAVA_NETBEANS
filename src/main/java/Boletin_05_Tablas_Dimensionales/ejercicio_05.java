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
public class ejercicio_05 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int t[][]=new int[7][7];
        int i,j;
        for (i=0;i<7;i++){
            for (j=0;j<7;j++){
                if (i==j){
                    t[i][j] = 1;
                }else{
                    t[i][j] = 0; // en java, al crear una tabla de enteros, todos los elementos se
                }
            }
        }
        
        // inicializan a 0. Por lo que esta instrucción no es necesaria. Se aña_
        // de para que el código sea más comprensible. 
        // mostramos la matriz
        // la forma de ver la matriz no es la típica que estamos acostumbrados en
        // matemática... pero desde el punto de vista del algoritmo no es relevante.
        
        System.out.println ("Matriz:");
        
        for (i=0;i<7;i++){
            for (j=0;j<7;j++){
                System.out.print(t[i][j]+" ");
                System.out.println ();
            }
        }
    }
}
