package com.example;

public class CodificandoMensajeSecreto {
    public static void main(String[] args) {

        // Convierte los números a letras

        String mensajeCodificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";

        String mensajeDecodificado = mensajeCodificado

                .replace('0', 'o')
                .replace('3', 'e')
                .replace('4', 'a');

        // Elimina los espacios en blanco adicionale

        mensajeDecodificado = mensajeDecodificado.trim();
        mensajeDecodificado = mensajeDecodificado.replaceAll("\\s+", " "); 


        // Convierte la cadena a mayúsculas

        mensajeDecodificado = mensajeDecodificado.toUpperCase();

        // Resultado

        System.out.println("El mnsaje decodificado es: " + mensajeDecodificado);

    }
}