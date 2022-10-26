/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_03_Bucles_anidados;

// Realiza una traza del siguiente algoritmo y muestra la salida generada por pantalla.

/**
 *
 * @author Adriano
 */
public class ejercicio_02 {
    public static void main(String[] args) {
        int j;
        for (int i=0;i<3;i++){
            j=i+1;
            while(j<4){
                System.out.println(j-i);
                j++;
            }
        }
    }
}
