/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

import java.util.Scanner;

//Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
//números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
//cuando el usuario acierta.

/**
 *
 * @author Adriano
 */
public class ejercicio_05 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int n, num;
        // n es el número que hay que acertar
        // num guarda los números introducidos
        n=(int)(Math.random()*100)+1;
        // en lugar de pedir n... podemos hacer que se n tome un valor
        // aleatorio entre 1 y 100.
        // Así el juego es algo más entretenido.

        System.out.print("Introduce número: ");
        num=Entrada.nextInt();

        while(num!=n){ // mientras no coincidan ambos números
        
            if(num>n){
                System.out.println("menor");
            }else{
                System.out.println("mayor");
            }
            
            System.out.print("Introduce número: ");
            num=Entrada.nextInt();
        }// al salir del mientras tenemos la certeza que num es igual a n

        System.out.println("acertaste...");
    }
}
