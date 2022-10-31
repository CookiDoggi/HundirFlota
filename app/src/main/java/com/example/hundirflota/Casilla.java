package com.example.hundirflota;

public class Casilla {

    private EstadoEnum estado = EstadoEnum.barco_hundido;

    enum EstadoEnum{
        barco_hit, barco_nohit, barco_hundido, agua, nohit;
    }

}