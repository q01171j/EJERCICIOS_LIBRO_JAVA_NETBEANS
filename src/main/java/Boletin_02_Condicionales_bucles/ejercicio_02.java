/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

import java.util.Scanner;

// Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.

/**
 *
 * @author Adriano
 */
public class ejercicio_02 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        
        System.out.print("Introduzca un número: ");
        num=Entrada.nextInt();
        
        while(num!=0) { // mientras num sea distinto de 0
            if(num>0){
                // mayor que cero: positivo
                System.out.println("Positivo");
            }else{
                // si no es positivo: es negativo
                System.out.println("Negativo");
                // repetimos el proceso y volvemos a leer num
                System.out.print("Introduzca otro número: ");
                num=Entrada.nextInt();
            }
        }
        // al salir del mientras tenemos la certeza que num es 0
    }
}
