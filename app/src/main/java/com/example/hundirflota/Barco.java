package com.example.hundirflota;

public class Barco extends Casilla{
    private int longitud;
    private OrientacionEnum orientacionActual;

    public Barco(int x, int y, int longitud, OrientacionEnum orientacionActual) {
        super(x,y);
        this.longitud = longitud;
        this.orientacionActual = orientacionActual;
    }

    enum OrientacionEnum {
        norte, sur, este, oeste;
        //vertical, horizontal;
    }
}