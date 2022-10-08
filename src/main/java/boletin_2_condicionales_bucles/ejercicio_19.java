/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_2_condicionales_bucles;

// Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_19 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nota,aprobados,suspensos,condicionados;
        aprobados=0;
        suspensos=0;
        condicionados=0;
 
        for (int i=1;i<=6;i++){
            System.out.print("Introduzca nota entre 0 y 10: ");
            nota=Entrada.nextInt();
            
            if(nota == 4){
                condicionados++;
            }else if(nota >= 5){
                aprobados++;
            }else if(nota < 4){ // este if sobra, ya que es el único caso posible
                suspensos++;
            }
        }
            
        System.out.println("Aprobados: " +aprobados);
        System.out.println("Suspensos: " +suspensos);
        System.out.println("Condicionados: "+condicionados);
    }
}
