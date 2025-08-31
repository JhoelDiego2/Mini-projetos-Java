package org.example;

public class Main {
    public static void main(String[] args) {
        Auxiliar auxiliar = new Auxiliar();
        auxiliar.mostrarBacon();
        auxiliar.mostrarBacon(400000);

        auxiliar.mostrarComBacons("jhoellll");

        Integer resultado = auxiliar.somarBacons(2, 10);
        auxiliar.somarBacons(resultado, 10);

        auxiliar.dividirBacons(10, 21);
    }
}