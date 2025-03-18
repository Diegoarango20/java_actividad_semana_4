package com.example;

import java.util.Scanner;

public class PrecioTaxiMedellin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nombre del cliente:

        System.out.println("Hola por favor ingrese su nombre");
        String nombreCliente = scanner.nextLine();

        //Ingresa la distancia del viaje

        System.out.println("Ingrese la distancia del viaje en kilómetros, por ejemplo: 8.2");
        double distancia = scanner.nextDouble();

        // Ingresa el tiempo de espera en tráfico:

        System.out.println("Ingrese el tiempo que espera pasar en tráfico,en minutos,por ejemplo: 10");
        int tiempoEspera = scanner.nextInt();

        
        //Calcula el precio del viaje:

        int tarifaBase = 4000;
        int valorKilometro = 1000;
        int valorMinuto = 200;

        //Calcula el precio total del viaje

        double precioTotal = tarifaBase + (distancia * valorKilometro) + (tiempoEspera * valorMinuto);

        // Resultado

        System.out.println("Hola " + nombreCliente);
        System.out.format("El precio del viaje es: $%,.0f", precioTotal);




        











    }
}