package com.sara.arrays;
/*Ejercicio:
 Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
 Recorre ambos mostrando únicamente el valor de cada elemento.
 */

import java.util.ArrayList;
public class Profesores {
    public Profesores() {
    }
    public void executeListado() {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Juaquin");
        lista.add("Gusta");
        lista.add("Mary");
        lista.add("Gaspar");

        for (String nombre : lista) {
            System.out.println(nombre);
        }

        System.out.println(" ");

        String nuevaLista[] = lista.toArray(new String[0]);

        for (String elemento : nuevaLista) {
            System.out.println(elemento);
        }
    }
}