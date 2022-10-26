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
public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int t[] = new int[10];
        int num,sitio_num,j;
        
        for(int i=0;i<5;i++){
            System.out.print("Introduzca numero (ordenado crecientemente): ");
            t[i]=Entrada.nextInt();
        }
        
        System.out.println("");
        System.out.print("Numero a insertar entre las anteriores: ");
        num=Entrada.nextInt();
        
        sitio_num=0;
        j=0;
        
        // buscaremos el sitio donde debería ir num
        while(t[j]<num && j<=4){
            sitio_num ++;
            j++;
        }
        // desplazaremos los elementos desde el sitio_num hasta el final
        // así haremos un hueco para num

        for (int i=4; i>=sitio_num; i--){
            t[i+1]=t[i];
        }
        // por último ponemos num en su sitio para que todo siga ordenado
        t[sitio_num]=num;
        System.out.println("La nueva serie ordenada queda: ");
        for (int i=0;i<5+1;i++){
            System.out.println(t[i]);
        }
    }
}
