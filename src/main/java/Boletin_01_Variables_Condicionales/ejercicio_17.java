/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_01_Variables_Condicionales;

// Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses tienen 30 días.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_17 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int dia,mes,año;
        System.out.print("Introduzca día: ");
        dia=Entrada.nextInt();
        System.out.print("Introduzca mes: ");
        mes=Entrada.nextInt();
        System.out.print("Introduzca año: ");
        año=Entrada.nextInt();
        // suponemos que la fecha introducida es correcta
        // incrementamos el día
        dia ++;
        
        // si el día supera 30, lo reiniciamos a 1 e incrementamos el mes
        if (dia >= 30){
            dia = 1;
            mes ++;
        }
        
        // si el mes supera 12, lo reiniciamos a 1 e incrementamos el año
        if (mes >= 12){
            mes = 1;
            año ++;
        }
        
        // habría que tener en cuenta que el año pasa del -1 al +1
        // en este código pasaríamos del año -1 al 0 (que nunca existió)
        // para corregirlo:
        if (año == 0){
            año = 1;
            System.out.println (dia + "/"+ mes + "/" + año);
        }
    }
}
