package com.sara;

import com.sara.arrays.ArrayBidimensional;
import com.sara.arrays.ArrayUnidimensional;
import com.sara.arrays.EliminarPares;
import com.sara.arrays.Profesores;
import com.sara.cadenaInvertida.CadenaInvertida;
import com.sara.excepcion.Calculadora;
import com.sara.lecturaArchivos.Lector;
import com.sara.repartidorDeCartas.PaqueteCartas;
import com.sara.vector.Alumnos;

public class Main {
    public static void main(String[] args) {

        System.out.println(CadenaInvertida.reverse(" "));

        ArrayUnidimensional arrayUnidimensional = new ArrayUnidimensional();
        arrayUnidimensional.execute();

        ArrayBidimensional arrayBidimensional = new ArrayBidimensional();
        arrayBidimensional.execute();

        Alumnos alumnos = new Alumnos();
        alumnos.executeListado();

        Profesores profesores = new Profesores();
        profesores.executeListado();

        EliminarPares eliminarPares = new EliminarPares();
        eliminarPares.execute();

        Calculadora calculadora = new Calculadora(4, 0);
        try {
            calculadora.dividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
           System.out.println("Demo de código");

            Lector lector = new Lector();
            lector.execute();

            PaqueteCartas paqueteCartas = new PaqueteCartas();
           paqueteCartas.barajar();

            for (int i =1; i <= 52; i++){
                    System.out.printf("%-19s", paqueteCartas.repartirCarta());
                if (i % 4 == 0)
                    System.out.println( );
            }
        }
    }
}