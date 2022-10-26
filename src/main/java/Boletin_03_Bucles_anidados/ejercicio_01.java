/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_03_Bucles_anidados;

//Realiza detenidamente una traza al siguiente programa y muestra cual seria la salida por pantalla:

/**
 *
 * @author Adriano
 */
public class ejercicio_01 {
    public static void main(String[] args) {
        int suma;
        for (int i=0;i<4;i++){
            for (int j=3;j>0;j--){
                suma=i*10+j;
                System.out.println(suma);
            }
        }
    }
}
