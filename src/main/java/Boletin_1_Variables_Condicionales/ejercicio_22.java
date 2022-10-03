/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_1_Variables_Condicionales;

//Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_22 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        int unidades, decenas;
        // esta versión muesrta 11 como diez y uno.
        // es una forma de hacerlo bastante burda.
        // se puede poner algunos condicionales para los números especiales: 11,12,...
        // y otro condicional para mostrar "y"
        System.out.print("Introduzca un número (0 a 99): ");
        num=Entrada.nextInt();

        unidades = num % 10;
        decenas = num / 10;
        
        switch(decenas){
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("diez");
                break;
            case 2:
                System.out.print("veinte");
                break;
            case 3:
                System.out.print("treinta");
                break;
            case 4:
                System.out.print("cuarenta");
                break;
            case 5:
                System.out.print("cincuenta");
                break;
            case 6:
                System.out.print("sesenta");
                break;
            case 7:
                System.out.print("setenta");
                break;
            case 8:
                System.out.print("ochenta");
                break;
            case 9:
                System.out.print("noventa");
                break;
        }

        System.out.print (" y ");
        
        switch(unidades){
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueva");
                break;
        }
    }
}
