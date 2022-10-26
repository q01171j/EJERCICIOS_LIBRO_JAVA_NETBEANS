/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_01_Variables_Condicionales;

import java.util.Scanner;

// Pedir los coeficientes de una ecuación se 2º grado, y muestre sus 
// soluciones reales. Si no existen, debe indicarlo. 

/**
 *
 * @author Adriano
 */
public class ejercicio_01 {
    public static void main(String[] args) {     
        Scanner Entrada = new Scanner(System.in);
        int a,b,c; // coeficientes ax^2+bx+c=0
        double x1=0;
        double x2=0;
        double d; // soluciones y determinante
        
        System.out.print("Introduzca primer coeficiente (a): ");
        a=Entrada.nextInt();
        System.out.print("Introduzca segundo coeficiente (b): ");
        b=Entrada.nextInt();
        System.out.print("Introduzca tercer coeficiente (c): ");
        c=Entrada.nextInt();
        
        // calculamos el determinante
        d = ((b*b)-4*a*c);
        
        // Condicional
        if(d<0) {
            System.out.println("No existen soluciones reales");
        }else if(d>0){
            // queda confirmar que a sea distinto de 0.
            // si a=0 nos encontramos una división por cero.
            x1 = (-b+Math.sqrt(d))/(2*a);
            x2 = (-b-Math.sqrt(d))/(2*a);
        }
        
        // Mostrar resultado
        System.out.println("Solución: " + x1);
        System.out.println("Solución: " + x2);
    }
}
