/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_03_Bucles_anidados;

// Realizar un programa que nos pida un numero n, y nos diga cuantos numeros hay entre 1 y n que son primos

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_06 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int j,num,cont_pri;
        boolean primo;
        
        cont_pri = 0;
        System.out.print("Introduce numero : ");
        num = Entrada.nextInt();
        
        //vamos procesando todos los numeros entre 1..num
        for(int i=1;i<=num;i++){
            //para cada numero i, calcularemos si es primo
            //veremos si el numero i es divisible en el rango 2..i-1
            //el bucle while se puede hacer con menos vuelta... consultar algoritmos para primos 
            
            primo = true;
            j=2;
            while(j<=i-1 && primo==true){
                if(i%j==0){
                    primo=false;
                }
                j++;
            }
            
            if(primo==true){
                cont_pri++; // si es primo incrementamos el contador de primos
                System.out.println(i+(" es primo"));
            }
        }
        System.out.println("En el rango 1.."+num+ ", hay "+cont_pri+" numeros primos");
    }
}
