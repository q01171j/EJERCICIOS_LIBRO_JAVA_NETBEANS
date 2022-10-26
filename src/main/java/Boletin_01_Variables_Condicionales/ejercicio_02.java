/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_01_Variables_Condicionales;

import java.util.Scanner;

// Pedir el radio de un círculo y calcular su área. A=PI*r^2.

/**
 *
 * @author Adriano
 */
public class ejercicio_02 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        // área y radio
        double a;
        double r;
        
        System.out.print("Introduce el radio de un circulo: ");
        r=Entrada.nextDouble();
        
        a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        
        System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
    }
}
