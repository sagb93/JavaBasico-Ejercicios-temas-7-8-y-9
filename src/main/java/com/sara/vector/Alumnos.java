package com.sara.vector;
/*Ejercicio:
Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final
*/

import java.util.Vector;
public class Alumnos {
    public Alumnos() {
    }
    public void executeListado (){
        Vector <String> listado = new Vector<>();
        listado.add("Pedro");
        listado.add("Pablo");
        listado.add("Maria");
        listado.add("Juan");
        listado.add("Ana");

        System.out.printf("Alumnos del curso:\n%s", listado);

        listado.remove(1);
        listado.remove(1);

        System.out.printf("\n\nLista de alumnos actualizada:\n%s ", listado);
    }
}

/*Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
Repuesta: Se duplica en memoria el consumo, lo que produce una operacion costosa.*/