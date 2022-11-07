package com.example.hundirflota;
//xd
public class Casilla {

    private int x,y;
    private int valor;
    private EstadoEnum estado;

    public Casilla(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.valor = 0;
    }

    enum EstadoEnum{
        agua, barco, barco_hit, barco_hundido, hit;
    }

}