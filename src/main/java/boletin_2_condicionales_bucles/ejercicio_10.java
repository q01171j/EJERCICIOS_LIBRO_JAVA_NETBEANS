/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_2_condicionales_bucles;

// Pedir 15 números y escribir la suma total.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num,suma_total;
        suma_total=0;

        for (int i=1;i<=15;i++){
            System.out.print("Introduzca número: ");
            num=Entrada.nextInt();
            suma_total=suma_total+num;
        }
        System.out.println("La suma total es de: "+suma_total);
    }
}
