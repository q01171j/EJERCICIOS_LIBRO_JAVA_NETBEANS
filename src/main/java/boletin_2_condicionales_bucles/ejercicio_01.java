/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_2_condicionales_bucles;

import java.util.Scanner;

// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.

/**
 *
 * @author Adriano
 */
public class ejercicio_01 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num,cuadrado;
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        
        System.out.print("Introduzca número: ");
        num=Entrada.nextInt();
        
        while(num>=0){ // repetimos el proceso mientras el número leído no sea negativo
            cuadrado=num*num;
            System.out.println(num+ "² es igual a "+ cuadrado);
            System.out.print("Introduzca otro número: ");
            num=Entrada.nextInt(); // volvemos a leer num
        }
    }
}
