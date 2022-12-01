# Ejercicios temas 7, 8 y 9

## Dada la función:
```sh
 public static String reverse(String texto) { }
```
Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
```sh
    System.out.println(CadenaInvertida.reverse(" "));
```
## Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
```sh
    ArrayUnidimensional arrayUnidimensional = new ArrayUnidimensional();
        arrayUnidimensional.execute();
```
## Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
```sh
    ArrayBidimensional arrayBidimensional = new ArrayBidimensional();
        arrayBidimensional.execute();
```
## Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
```sh
    Alumnos alumnos = new Alumnos();
        alumnos.executeListado();
```
## Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
```sh
    Profesores profesores = new Profesores();
        profesores.executeListado();
```
## Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
```sh
    EliminarPares eliminarPares = new EliminarPares();
        eliminarPares.execute();
```
## Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
```sh
    Calculadora calculadora = new Calculadora(4, 0);
        try {
            calculadora.dividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
           System.out.println("Demo de código");
```
## Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
```sh
     Lector lector = new Lector();
        lector.execute();
```
## Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
```sh
    PaqueteCartas paqueteCartas = new PaqueteCartas();
            paqueteCartas.barajar();
            for (int i =1; i <= 52; i++){
                System.out.printf("%-19s", paqueteCartas.repartirCarta());
                if (i % 4 == 0)
                    System.out.println( );
```