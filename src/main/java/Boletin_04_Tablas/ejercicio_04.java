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
public class ejercicio_04 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int i, t[];
        t = new int[10];
        for (i=0;i<10;i++){
            System.out.print("Introduzca numero: ");
            t[i]=Entrada.nextInt();
        }
        
        System.out.println("El resultado es:");
        
        for (i=0;i<=4;i++){
            System.out.println (t[i]); // mostramos el i-ésimo número por el principio
            System.out.println(t[9-i]); // y el i-ésimo por el final
        }
        // como en cada vuelta de for se muestran dos números
        // para mostrarlos todos, solo necesitaremos la mitad de vueltas.

    }
}
