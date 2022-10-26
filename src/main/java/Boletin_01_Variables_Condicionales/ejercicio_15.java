/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_01_Variables_Condicionales;

// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int dia,mes,año;
        // para que una fecha sea correcta se tiene que cumplir
        // día en el rango 1..30
        // mes en el rango 1..12
        // año cualquiera distinto del 0
        System.out.print("Introduzca día: ");
        dia=Entrada.nextInt();
        System.out.print("Introduzca mes: ");
        mes=Entrada.nextInt();
        System.out.print("Introduzca año: ");
        año=Entrada.nextInt();

        if (dia >= 1 && dia <=30) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    System.out.println ("Fecha correcta");
                }else {
                    System.out.println ("Año incorrecto");
                }
            }else {
                System.out.println("Mes incorrecto");
            }
        }else{
            System.out.println("Día incorrecto");
        }
    }
}
