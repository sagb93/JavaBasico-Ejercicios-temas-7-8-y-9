package com.sara.lecturaArchivos;

/*Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".*/

import java.io.*;

public class Lector {
    public Lector() {
    }

    public void execute() {

        try {
            InputStream fileIn = new FileInputStream("C://SaraJava//Tema7-8-9JavaBasico//storage//ListadoAlumnos.txt");
            int datos = fileIn.read();
            fileIn.close();

            PrintStream fileOut = new PrintStream("C://SaraJava//Tema7-8-9JavaBasico//storage//copia.txt");
            fileOut.write(datos);
            fileOut.close();

            System.out.println("Archivo copiado");

        } catch (IOException e) {
            System.out.println("no se puede leer el archivo" + e.getMessage());
        }
    }
}