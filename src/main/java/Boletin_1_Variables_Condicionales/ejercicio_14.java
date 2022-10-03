/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_1_Variables_Condicionales;

// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nota;
        System.out.print("Introduzca una nota: ");
        nota=Entrada.nextInt();
        switch(nota){
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("INSUFICIENTE");
            break;
        case 5:
            System.out.println("SUFICIENTE");
            break;
        case 6:
            System.out.println("BIEN");
            break;
        case 7:
        case 8:
            System.out.println("NOTABLE");
            break;
        case 9:
        case 10:
            System.out.println("SOBRESALIENTE");
            break;
        default:
            System.out.println("ERROR");
            break;
        }
    }
}
