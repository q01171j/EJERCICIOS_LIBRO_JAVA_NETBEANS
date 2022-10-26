/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

// Escribir todos los números del 100 al 0 de 7 en 7.

/**
 *
 * @author Adriano
 */
public class ejercicio_09 {
    public static void main(String[] args) {
        // inicializamos la i a 100
        // mientras la i sea mayor o igual a 0
        // y en cada vuelta del for la i se decrementa en 7
        for (int i=100;i>=0;i-=7){
            System.out.println(i);
        }
        // el for al llevar una sola instrucción en su cuerpo de ejecución
        // no precisa de llaves { }
    }
}
