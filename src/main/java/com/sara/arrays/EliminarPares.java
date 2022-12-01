package com.sara.arrays;
/*Ejercicio:
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 * A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra
 * el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 * */

import java.util.ArrayList;

public class EliminarPares {
    public EliminarPares() {
    }

    public void execute() {

        ArrayList<Integer> numero = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numero.add(i);
        }

        System.out.println(numero);

        numero.removeIf(n -> (n % 2 == 0));
        System.out.println(numero);
    }
}