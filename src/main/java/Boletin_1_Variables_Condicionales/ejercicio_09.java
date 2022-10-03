/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_1_Variables_Condicionales;

// Pedir dos números y mostrarlos ordenados de mayor a menor.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_09 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1=Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n2=Entrada.nextInt();
 
        if(n1>n2){
            System.out.println(n1 + " y " + n2);
        }else{
            System.out.println(n2 + " y " + n1); 
        }
    }
}
