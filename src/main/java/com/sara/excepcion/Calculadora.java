package com.sara.excepcion;

/*Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
*/
public class Calculadora {
    int A;
    int B;
    public Calculadora(int a, int b){
        A = a;
        B = b;
    }
    public void dividePorCero() throws ArithmeticException{
        int resultado = A/B;
        System.out.printf("El resultado de la division es: %d\n", resultado);

    }
}