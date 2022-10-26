/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

import java.util.Scanner;

// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

/**
 *
 * @author Adriano
 */
public class ejercicio_06 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num,suma;
        suma=0;
        
        do {
            System.out.print("Introduzca un número: ");
            num=Entrada.nextInt();
            suma=suma+num;
        }while(num!=0);

        System.out.println("La suma de todos los números es: "+suma);
    }
}
