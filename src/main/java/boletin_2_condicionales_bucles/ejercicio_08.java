/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_2_condicionales_bucles;

// Pedir un número N, y mostrar todos los números del 1 al N.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_08 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int i,num;
        System.out.print("Introduce un número: ");
        num=Entrada.nextInt();
        i=1;
        // i es el contador que tomará los valores de 1 a n
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
