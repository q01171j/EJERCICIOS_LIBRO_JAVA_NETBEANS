/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_2_condicionales_bucles;

// Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las

import java.util.Scanner;

// facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el
// precio por litro. 
// Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1
// y cuantas facturas se emitieron de más de 600 €.

/**
 *
 * @author Adriano
 */
public class ejercicio_17 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int codigo; // el código del artículo en cada factura
        int litros; // la cantidad de litros en cada factura
        float precio; // el precio por litro en cada factura
        float importe_factura; // guardará el importe de la factura con la que estemos trabajando
        float facturacion_total; // el importe de todas las facturas
        int litros_cod1; // el total de litros vendidos del producto 1 en todas las facturas
        int mas_600; // contador que sirve para llevar la cuenta de cuantas facturas hay demás de 600 €
        
        facturacion_total = 0;
        litros_cod1 = 0;
        mas_600 = 0;
        
        for (int i=1;i<=5;i++){
            System.out.println("Factura nº " + i);
            System.out.print("código de producto: ");
            codigo=Entrada.nextInt();
            System.out.print("cantidad (litros): ");
            litros=Entrada.nextInt();
            System.out.print("precio (litro): ");
            precio= (float)Entrada.nextDouble();
            importe_factura = litros*precio;
            facturacion_total += importe_factura;
            
            if (codigo == 1){
                litros_cod1 += litros;
            }
            
            if(importe_factura >= 600){
                mas_600 ++;
            }
            
            System.out.println("\n\n\nResumen de ventas\n");
            // facturación total
            System.out.println("La facturación total es de: " +facturacion_total + "€");
            // litros del articulo 1
            System.out.println("Ventas del producto 1: " + litros_cod1 + " litros");


            // factura de mas de 600 euros
            System.out.println("Factura superior a 600€: " + mas_600);
        }
    }
}
