/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_01_Variables_Condicionales;

// Pedir dos números y decir cual es el mayor o si son iguales.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_08 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1=Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n2=Entrada.nextInt();

        if(n1==n2) {
            System.out.println("Son iguales");
        }else if(n1>n2){
            System.out.println(n1 + " es mayor que " + n2);
        }else{
            System.out.println(n2 + " es mayor que " + n1);
        }
    }
}
