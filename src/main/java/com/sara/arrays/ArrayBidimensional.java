package com.sara.arrays;

/*Ejercicio:
Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
*/

public class ArrayBidimensional {
    public ArrayBidimensional() {
    }
    public void execute(){

        int aaa [][] = new int[2][4];

        aaa [0][0] = 1;
        aaa [0][1] = 2;
        aaa [0][2] = 3;
        aaa [0][3] = 4;

        aaa [1][0] = 5;
        aaa [1][1] = 6;
        aaa [1][2] = 7;
        aaa [1][3] = 8;

        for (int i = 0; i < aaa.length; i++){

            System.out.println("  ");

            for(int j = 0; j < aaa[i].length; j++){
                System.out.printf("Posicion: %d\t\tValor: %d\n", i, aaa [i] [j]);

            }
        }
    }
}