/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_04_Tablas;

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int t[]=new int[10];
        int ultimo;
        int n;
        // leemos la tabla
        for (int i=0;i<10;i++){
            System.out.print("Introduzca número: ");
            t[i]=Entrada.nextInt();
        }
        
        // preguntamos cuantas posiciones se desea desplazar
        System.out.print("Posiciones a desplazar:" );
        n = Entrada.nextInt();
        
        // del ejercicio anterior tenemos una versión que desplaza una sola
        // posición. Si repetimos este proceso n veces, conseguiremos
        // desplazar n veces.
        // este algoritmo es muy fácil de implementar, pero es muy costoso en tiempo.
        for (int vueltas=1;vueltas <=n; vueltas++){
            // guardamos el último elemento de la tabla
            ultimo = t[9];
            // desplazamos hacia abajo (de 0 hacia la última posición)
            // al desplazar perdemos el último valor, por eso lo tenemos guardado.
            for (int i=8;i>=0;i--)
            t[i+1]=t[i];
            // el último valor pasa a ser el primero
            t[0] =ultimo;
        }
        
        System.out.println("La tabla queda:");
        for (int i=0;i<10;i++){
            System.out.println(t[i]);
        }
    }
}
