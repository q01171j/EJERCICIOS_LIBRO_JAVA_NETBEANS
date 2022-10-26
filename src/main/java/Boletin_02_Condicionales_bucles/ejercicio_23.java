/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

// Pedir 5 números e indicar si alguno es multiplo de 3

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_23 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        boolean multiplo_3;
        multiplo_3=false;
        for (int i=0;i<5;i++){
            System.out.print("Introduzca número: ");
            num=Entrada.nextInt();
            if(num %3 == 0){
                multiplo_3=true; // si se ejecuta esta instrucción significa que al menos hay un múltiplo de 3.
            }
        }
        
        if(multiplo_3 == false){
            System.out.println("no existen múltiplos de 3");
        }else{
            System.out.println("Hay múltiplos de 3");
        }
    }
}
