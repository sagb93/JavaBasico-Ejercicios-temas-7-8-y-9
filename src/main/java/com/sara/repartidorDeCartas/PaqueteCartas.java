package com.sara.repartidorDeCartas;

import java.util.Random;

public class PaqueteCartas {

    private Carta[] paquete;
    private int cartaActual;
    private static final int NumeroDeCartas = 52;
    private static final Random numerosAleatorios = new Random();

    public PaqueteCartas() {
        String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jota", "Reina", "Rey"};
        String[] palos = {"Diamantes", "Corazones", "Treboles", "Espada"};
        paquete = new Carta[NumeroDeCartas];
        cartaActual = 0;

        for (int cuenta = 0; cuenta < paquete.length; cuenta++)
            paquete[cuenta] = new Carta(caras [cuenta % 13], palos[cuenta / 13]);
    }

    public void barajar(){
        cartaActual = 0;

        for(int primera = 0; primera < paquete.length; primera++){
            int segunda = numerosAleatorios.nextInt(NumeroDeCartas);

            Carta mostrar = paquete[primera];
            paquete[primera] = paquete [segunda];
            paquete [segunda] = mostrar;
        }
    }

    public Carta repartirCarta(){

        if (cartaActual < paquete.length)
            return paquete [cartaActual++];
        else
            return null;
    }
}