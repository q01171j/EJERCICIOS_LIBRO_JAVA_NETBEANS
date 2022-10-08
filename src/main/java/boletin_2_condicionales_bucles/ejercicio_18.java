/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_2_condicionales_bucles;

// Igual que el anterior pero suponiendo que no se introduce el precio por litro. Solo existen tres

import java.util.Scanner;

// productos con precios: 
// 1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.

/**
 *
 * @author Adriano
 */
public class ejercicio_18 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int codigo; // el código del artículo en cada factura
        int litros; // la cantidad de litros en cada factura
        float precio; // ahora el precio no se pide por teclado
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
            switch (codigo){
                case 1:
                    precio = 0.6f;
                    break;
                case 2:
                    precio = 3f;
                    break;
                case 3:
                    precio = 1.25f;
                    break;
                default:
                    precio = 0; // este caso no debe darse
            }
 
            importe_factura = litros*precio;
            facturacion_total += importe_factura;
            if (codigo == 1){
                litros_cod1 += litros;
            }
            
            if(importe_factura >= 600){
                mas_600 ++;
            }
        }
        
        System.out.println ("\n\n\nResumen de ventas\n");
        // facturación total
        System.out.println("La facturación total es de: " +facturacion_total + "€");
        // litros del articulo 1
        System.out.println("Ventas del producto 1: " + litros_cod1 + " litros");
 
 
        // factura de mas de 600 euros
        System.out.println("Factura superior a 600€: " + mas_600);
    }
}
