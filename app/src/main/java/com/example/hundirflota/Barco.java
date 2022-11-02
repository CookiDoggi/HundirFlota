package com.example.hundirflota;

public class Barco {
    private int size;
    private OrientacionEnum orientacionActual;
    private Casilla casillaOrigen;

    public Barco(int size, OrientacionEnum orientacionActual, Casilla casillaOrigen) {
        this.size = size;
        this.orientacionActual = orientacionActual;
        this.casillaOrigen = casillaOrigen;
    }

    enum OrientacionEnum {
        //norte, sur, este, oeste;
        vertical, horizontal;
    }
}