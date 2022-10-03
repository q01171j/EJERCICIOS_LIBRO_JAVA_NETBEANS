/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_1_Variables_Condicionales;

// Pedir tres números y mostrarlos ordenados de mayor a menor.

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        int a,b,c;
        System.out.print("Introduzca primer número: ");
        a=Entrada.nextInt();
        System.out.print("Introduzca segundo número: ");
        b=Entrada.nextInt();
        System.out.print("Introduzca tercer número: ");
        c=Entrada.nextInt();
        
        if(a>b && b>c){
            System.out.println( a+", "+b+", "+c);
        }else if(a>c && c>b){
            System.out.println(a+", "+c+", "+b);
        }else if(b>a && a>c){
            System.out.println(b+", "+a+", "+c);
        }else if(b>c && c>a){
            System.out.println(b+", "+c+", "+a);
        }else if(c>a && a>b){
            System.out.println(c+", "+a+", "+b);
        }else if(c>b && b>a){
            System.out.println(c+", "+b+", "+a);
        }
    }
}
