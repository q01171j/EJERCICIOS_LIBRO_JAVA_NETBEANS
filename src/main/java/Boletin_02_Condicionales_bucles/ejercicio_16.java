/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

//Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_16 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        do{
            System.out.print("Introduce número (de 0 a 10): ");
            num=Entrada.nextInt();
        }while ( ! (0<=num && num<=10));
 
        System.out.println("\n\nTabla del " + num);
 
        for (int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
