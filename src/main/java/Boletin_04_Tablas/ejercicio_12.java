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
public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int t[]=new int[10];
        int posicion;
        // leemos los 10 números
        for (int i=0;i<10;i++){
            System.out.print("Elemento ("+i+"): ");
            t[i]=Entrada.nextInt();
        }

        System.out.println();
        // leemos la posición que nos interesa
        // suponemos que la posición está en el rango 0..9
        System.out.print("Posición a eliminar: ");
        posicion=Entrada.nextInt();
        // desplazamos desde posición hasta el final todos los elementos un lugar hacia la izquierda
        // con lo que el elemento que está en posición se pierde (se borra)
        for (int i=posicion;i<9;i++){ // la i llega hasta la penúltima posición,
            t[i] = t[i+1]; // ya que dentro usamos (i+1) que es la última posición
                            // así evitamos salirnos de la tabla
        }
        
        System.out.println("La tabla queda: ");
        for (int i=0;i<9;i++){ // hay que tener cuidado que ahora hay un
            System.out.println(t[i]); // elemento útil menos en la tabla
        }
    }
}
