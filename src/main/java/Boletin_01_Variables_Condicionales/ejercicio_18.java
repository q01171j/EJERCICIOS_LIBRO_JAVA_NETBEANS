/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_01_Variables_Condicionales;

//Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días).

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_18 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int dia,mes,año;
        int dias_del_mes=0; // guardaremos el número de días que tiene el mes
        System.out.print("Introduzca día: ");
        dia=Entrada.nextInt();
        System.out.print("Introduzca mes: ");
        mes=Entrada.nextInt();
        System.out.print("Introduzca año: ");
        año=Entrada.nextInt();
        
        // suponemos que la fecha introducida es correcta
        if(mes==2 ){
            dias_del_mes = 28;
        }
        
        if(mes==4 || mes==6 || mes==9 || mes==11){
            dias_del_mes = 30;
        }
        
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            dias_del_mes = 31;
        }
        
        // incrementamos el día
        dia ++;
        // si el día supera el número de días del mes,
        // lo reiniciamos a 1 e incrementamos el mes

        if (dia >= dias_del_mes){
            dia = 1;
            mes ++;
            // si el mes supera 12, lo reiniciamos a 1 e incrementamos el año
        }
        
        if (mes >= 12){
            mes = 1;
            año ++;
        }
        // habría que tener en cuenta que el año pasa del -1 al +1
        // en este código pasaríamos del año -1 al 0 (que nunca existió)
        // para corregirlo:
        if (año == 0)
        año = 1;

        System.out.println (dia +"/"+mes+"/"+año);
    }
}
