package com.example;

import java.util.Scanner;

public class PropinaRestaurante {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


        // Nombre del cliente:

        System.out.println("Hola por favor ingrese su nombre");
        String nombreCliente = scanner.nextLine();

        // Ingresa el valor de la cuenta:

        System.out.println("Por favor ingrese el valor total de la cuenta incluyendo el IVA");
        double valorCuenta = scanner.nextDouble();

        // Elige el porcentaje de propina:

        System.out.println( "Por favor ingrese el porcentaje de propina que desea dejar,por ejemplo: 12");
        double porcentajePropina = scanner.nextDouble();

        //Calcula el valor de la propina:

        double valorPropina = (porcentajePropina / 100 ) * valorCuenta;

        //Calcula el valor total a pagar:

        double valorTotal = valorCuenta + valorPropina;

        // Resultado

        System.out.println("Hola " + nombreCliente);
        System.out.println("Nos encanto tu visita, esta es tu cuenta");
        System.out.println("----------------------------------------------");
        System.out.format("Valor de la cuenta: $%,.2f%n" , valorCuenta);
        System.out.format("Porcentaje de propina: %.0f%%%n" , porcentajePropina);
        System.out.format("Valor de la propina: $%,.2f%n" , valorPropina);
        System.out.format("Valor total a pagar: $%,.2f%n" , valorTotal);
        System.out.println("Muchas gracias por visitarnos " + nombreCliente);
        System.out.println("----------------------------------------------");












    }
}