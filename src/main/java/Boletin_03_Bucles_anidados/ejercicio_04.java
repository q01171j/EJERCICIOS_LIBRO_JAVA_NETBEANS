/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_03_Bucles_anidados;

// Dibuja un cuadrado de n elementos de lado utilizando *.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_04 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int n; // tamaño del lado
        int fila, col;
        System.out.print ("Lado del cuadrado: ");
        n = Entrada.nextInt();
        for (fila=1; fila<=n; fila++){
            for (col=1; col<=n; col++){
                System.out.print ("* ");
            }
            System.out.println ("");
        }
    }
}
