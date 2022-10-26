/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

// Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_22 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int notas;
        boolean suspensos;
        
        suspensos = false; // suponemos que en principio no hay ningún suspenso
        
        for(int i = 0; i<5;i++){
            System.out.println("Introduzca nota (de 0 a 10): ");
            notas = Entrada.nextInt();
            
            if(notas<5){
                suspensos = true;
            }
        }
        
        if(suspensos){
            System.out.println("Hay alumnos suspensos");
        }else{
            System.out.println("No hay suspensos");
        }
    }
}
