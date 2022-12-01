package com.sara.cadenaInvertida;

/*Ejercicio:
Dada la función: public static String reverse(String texto) { } Escribe el código que devuelva una cadena al revés.
Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
*/

public class CadenaInvertida {

    public CadenaInvertida() {
    }
    public static String reverse (String cadena) {

        cadena = "¡El Futuro es Hoy!";
        System.out.println(cadena);

        StringBuilder stringBuilder = new StringBuilder(cadena);
        String invertida = stringBuilder.reverse().toString();

        return ("Frase invertida: " + invertida);
    }
}