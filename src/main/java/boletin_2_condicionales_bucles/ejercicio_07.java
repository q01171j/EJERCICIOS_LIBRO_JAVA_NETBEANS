/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_2_condicionales_bucles;

// Pedir números hasta que se introduzca uno negativo, y calcular la media.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_07 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num, suma, elementos;
        float media; // la media puede tener decimales
        // num: guardará los números introducidos por el usuario
        // suma: almacenará la suma de todos los números introducidos
        // elementos: será un contador que indicará el números de números 8o elementos) introducidos
        System.out.print("Introduzca un número: ");
        num=Entrada.nextInt();

        suma= 0;
        elementos= 0;

        while(num>=0){ // nos interesan los positivos y el cero
            suma+=num;
            elementos++;
            System.out.print("Introduzca otro número: ");
            num=Entrada.nextInt();
        }
        
        if (elementos == 0){ // daría un error de división por cero
            System.out.println("Imposible hacer la media");
        }else{
            media= (float)suma/elementos;
            System.out.println("La media es de: " + media);
        }
    }
}
