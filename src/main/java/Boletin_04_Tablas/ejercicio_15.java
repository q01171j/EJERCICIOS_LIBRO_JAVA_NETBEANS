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
public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int t[]=new int[10];
        int num,j;
        for (int i=0;i<10;i++){
            System.out.print("Introduzca numero (orden creciente): ");
            t[i]=Entrada.nextInt();
        }
        
        System.out.println();

        System.out.println("Introduzca numero a buscar: ");
        num=Entrada.nextInt();
        j=0;
        
        while(j<10 && t[j]<num){
            j++;
        }
        
        // cuando me salgo del mientras puede ser por dos motivos:
        // - que j llegue a 10 ó
        // - que encuentre el donde iría num en la tabla
        
        if(j==10){ // hemos llegado al final y no hemos encontrado nada.
            System.out.println("No encontrado");
        }else{
            // si t[j] < num, hemos sobrepasado el lugar donde debería estar num, sin encontrarlo
            if(t[j]==num){ // num está en la posición i. Entonces si está ahí
                System.out.println("Encontrado en la posición " + j);
            }else{
                System.out.println("No encontrado");
            }
        }
    }
}
