/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_02_Condicionales_bucles;

// Diseñar un programa que muestre el producto de los 10 primeros números impares.

/**
 *
 * @author Adriano
 */
public class ejercicio_11 {
    public static void main(String[] args) {
        long producto=1; 
        // producto guardará la multiplicación de los 10 primeros números impares.
        // es muy importante acordarse de inicializarlo a 1. Ya que si lo hacemos a 0,
        // el producto siempre valdrá 0.
        // para calcular los 10 primeros números impares utilizamos un for que:
        // comience en 1
        // y en cada vuelta se incremente en 2, así obtenemos
        // 1, 3, 5, 7, 9, 11, 13, 15, 17, 19.
        for (int i=1; i<20; i+=2) {
            producto=producto*i;
        }
        
        System.out.println("La multiplicación de los 10 primeros impares: " + producto);
    }
}
