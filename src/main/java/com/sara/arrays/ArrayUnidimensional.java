package com.sara.arrays;
/*Ejercicio:
* Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
*/

public class ArrayUnidimensional {
    public ArrayUnidimensional() {
    }

    public void execute (){

        String archivo [] = new String[5];
        archivo[0] = "UNO";
        archivo[1] = "DOS";
        archivo[2] = "TRES";
        archivo[3] = "CUATRO";
        archivo[4] = "CINCO";

        for (String i : archivo){
            System.out.println(i);
        }
    }
}
