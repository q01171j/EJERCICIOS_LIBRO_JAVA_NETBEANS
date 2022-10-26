/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_03_Bucles_anidados;

// Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10

/**
 *
 * @author Adriano
 */
public class ejercicio_03 {
    public static void main(String[] args) {
        int tabla,i;
        for (tabla=1; tabla<=10; tabla++){
            System.out.println ("\n\nTabla del " +tabla);
            System.out.println ("---------------");
            
            for (i=1;i<=10;i++){
                System.out.println (tabla + " x " + i + " = " + tabla*i);
            }
        }
    }
}
