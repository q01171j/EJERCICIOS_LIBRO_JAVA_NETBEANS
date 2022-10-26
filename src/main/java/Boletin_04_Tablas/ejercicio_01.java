/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_04_Tablas;

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_01 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int t[]; 
        t = new int[5];
        for (int i=0;i<5;i++){
            System.out.print("Introduzca un número: ");
            t[i]=Entrada.nextInt();
        }
        
        System.out.println("Los números son:");
        for (int i=0;i<5;i++){
            System.out.println(t[i]);
        }
    }
}
