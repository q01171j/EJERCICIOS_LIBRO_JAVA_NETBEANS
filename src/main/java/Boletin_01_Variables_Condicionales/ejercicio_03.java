/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_01_Variables_Condicionales;

import java.util.Scanner;

// Pedir el radio de una circunferencia y calcular su longitud.

/**
 *
 * @author Adriano
 */
public class ejercicio_03 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double l,r; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        r=Entrada.nextDouble();
        
        l=2*Math.PI*r;
 
        System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
    }
}
