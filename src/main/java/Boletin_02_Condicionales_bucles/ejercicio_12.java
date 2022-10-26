/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

//  Pedir un número y calcular su factorial.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        // long factorial; con long se puede calcular hasta el factorial de 25
        double factorial;
        int num;
        System.out.print("Introduce un número: ");
        num=Entrada.nextInt();
        factorial=1; // es importante inicializarlo a 1, ya que multiplicará-
 
        // por ejemplo: el factorial de 10 es:
        // 10*9*8*7*6*5*4*3*2*1

        for (int i=num;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
