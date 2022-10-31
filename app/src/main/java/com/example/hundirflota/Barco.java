package com.example.hundirflota;

public class Barco {
    private int size;
    private orientacion orientacionActual;

    public Barco(int size){
        this.size=size;
    }

    enum orientacion{
        norte, sur, este, oeste;
    }
}
