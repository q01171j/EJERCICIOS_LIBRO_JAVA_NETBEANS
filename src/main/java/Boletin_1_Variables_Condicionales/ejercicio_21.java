/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_1_Variables_Condicionales;

import java.util.Scanner;

//Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...

/**
 *
 * @author Adriano
 */
public class ejercicio_21 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        System.out.print("Introduzca una nota numérica entre 0 y 10: ");
        num=Entrada.nextInt();
        switch(num){
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
        }
    }
}
