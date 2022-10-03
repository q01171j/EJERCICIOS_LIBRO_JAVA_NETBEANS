/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_1_Variables_Condicionales;

// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_16 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int dia,mes,año;
        System.out.print("Introduzca día: ");
        dia=Entrada.nextInt();
        System.out.print("Introduzca mes: ");
        mes=Entrada.nextInt();
        System.out.print("Introduzca año: ");
        año=Entrada.nextInt();

        // el único año que no existe es el 0
        if(año==0){
            System.out.println("Fecha incorrecta");
        }else if(mes==2 && (dia>=1 && dia<=28)){
            System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");
        }else if((mes==4 || mes==6 || mes==9 || mes==11) && (dia>=1 && dia<=30)){
            System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");
        }else if( (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia>=1 && dia<=31)){
            System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");
        }else{
            System.out.println("Fecha incorrecta");
        }
    }
}
