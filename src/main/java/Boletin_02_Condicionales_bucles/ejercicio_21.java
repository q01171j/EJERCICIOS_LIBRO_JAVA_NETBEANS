/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

// Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_21 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        boolean hay_negativo;
        // la variable hay_negativo según los dos posibles valores indica:
        // false: no se ha introducido ningún número negativo
        // true: al menos hay un número negativo
        hay_negativo =false;
        // suponemos que no habrá ningún negativo
        for (int i=1;i<=10;i++){
            System.out.print("Introduce número: ");
            num=Entrada.nextInt();
            if(num<0){
                hay_negativo =true;
                // si num es menor que cero, cambiamos el valor de hay_negativo a true
            }
        }
            
        if(hay_negativo == true){
            System.out.println("Se ha introducido algún número negativo");
        }else{
            System.out.println("No hay ningún número negativo");
        }
    }
}
