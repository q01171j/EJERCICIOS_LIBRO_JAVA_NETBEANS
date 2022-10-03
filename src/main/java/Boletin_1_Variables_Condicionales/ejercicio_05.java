/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_1_Variables_Condicionales;

import java.util.Scanner;

// Pedir un número e indicar si es positivo o negativo.

/**
 *
 * @author Adriano
 */
public class ejercicio_05 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número: ");
        num=Entrada.nextInt();
 
        if( num < 0) {
            System.out.println("Negativo");
        }else{
            // suponemos que el 0 es positivo.
            System.out.println("Positivo");
        }
    }
}
