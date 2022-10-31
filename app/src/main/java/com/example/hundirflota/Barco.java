package com.example.hundirflota;

public class Barco {
    private int size;
    private OrientacionEnum orientacionActual;

    public Barco(int size) {
        this.size = size;
    }

    enum OrientacionEnum {
        norte, sur, este, oeste;
    }
}

