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
public class ejercicio_16 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int primer[], segundo[], tercer[]; // notas del primer, segundo y tercer trimestre
        int num,i;
        int suma_primer, suma_segundo, suma_tercer;
        double media_alumno;
        // creamos las tablas necesarias
        primer = new int [5];
        segundo = new int [5];
        tercer = new int [5];
        // el programa consta de dos partes: entrada de datos y procesado. Se podrían procesar las 
        // notas mientras se leen. Preferimos utilizar dos bloques por tener un código más legible.
        // leemos las notas del primer trimestre
        System.out.println("Notas de primer trimestre:");
        for (i=0;i<5;i++){
            System.out.print("Alumnos ("+i+"): ");
            primer[i]=Entrada.nextInt();
        }
        // leemos las notas del segundo trimestre
        System.out.println("Notas del segundo trimestre:");
        for (i=0;i<5;i++){
            System.out.print("Alumno ("+i+"): ");
            segundo[i]=Entrada.nextInt();
        }
        // leemos las notas del tercer trimestre
        System.out.println("Notas del tercer trimestre:");
        for (i=0;i<5;i++){
            System.out.print("Alumnos ("+i+"): ");
            tercer[i]=Entrada.nextInt();
        }
        // calculamos las medias
        suma_primer = 0; // ponemos a 0 los acumuladores
        suma_segundo = 0;
        suma_tercer = 0;
        for (i =0; i < 5; i++){
            suma_primer += primer[i];
            suma_segundo += segundo[i];
            suma_tercer += tercer[i];
        }
        // mostramos datos
        System.out.println("Media primer trimestre: "+ suma_primer/5.0);
        System.out.println("Media segundo trimestre: "+ suma_segundo/5.0);
        System.out.println("Media tercer trimestre: "+ suma_tercer/5.0);
        System.out.println();
        // leemos la posición del alumnos que nos interesa
        // una posible mejora es comprobar que el índice se encuentre
        // entre 0 y 4
        System.out.print ("Introduzca posición del alumno (de 0 a 9): ");
        num=Entrada.nextInt();
        // la media del alumno es la suma de sus notas entre 3
        media_alumno = (double) (primer[num]+segundo[num]+tercer[num])/3;

        System.out.println("La media del alumno es: " + media_alumno);
    }
}
