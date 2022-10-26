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
public class ejercicio_05 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int a[], b[], c[];
        int i,j;
        a=new int[10];
        b=new int[10];
        // la tabla c tendrá que tener el doble de tamaño que a y b.
        c = new int [20];
        // leemos la tabla a
        System.out.println("Leyendo la tabla a");
        for (i=0;i<10;i++){
            System.out.print("número: ");
            a[i]=Entrada.nextInt();
        }
        // leemos la tabla b
        System.out.println("Leyendo la tabla b");
        
        for (i=0;i<10;i++){
            System.out.print("número: ");
            b[i]=Entrada.nextInt();
        }
        // asignaremos los elementos de la tabla c
        // para las tablas a y b utilizaremos como índice i
        // y para la tabla c utilizaremos como índice j.
        j=0;
        for (i=0;i<10;i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        
        System.out.println("La tabla c queda: ");
        
        for (j=0;j<20;j++){ // seguimos utilizando j, para la tabla c. Aunque se podría utilizar i.
            System.out.print(c[j]+" ");
        }
        
        System.out.println("");
    }
}
