/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

// Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_20 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int sueldo, sueldo_max=0;
        int n;
        boolean primer_sueldo_asignado;
        // esta bandera indica si hemos asignado el primer sueldo como sueldo máximo
        // con esto podremos tener sueldos negativos
        primer_sueldo_asignado = false;
 
        System.out.print("Número de sueldos: ");
        n = Entrada.nextInt();
        System.out.println("--------");
        
        for (int i=1;i<=n;i++){
            System.out.print("Introduce sueldo: ");
            sueldo=Entrada.nextInt();
            if (primer_sueldo_asignado == false){
                // asignamos como máximo el primer sueldo leído
                sueldo_max = sueldo;
                primer_sueldo_asignado = true;
            }
            
            if (sueldo > sueldo_max){
                sueldo_max = sueldo;
                // si leemos un sueldo mayor que el máximo, este sueldo será el nuevo máximo.
            }
        }
        
        System.out.println("\nEl sueldo máximo es: " +sueldo_max);
    }
}
