package com.example.hundirflota;

public class Datos {
    private static Casilla [][] tableroBarcos;
    private static Casilla [][] tableroBombas;

    public Datos()
    {
        this.tableroBarcos = new Casilla[10][10];
        this.tableroBombas = new Casilla[10][10];
    }

    public static Casilla[][] getTableroBombas() {
        return tableroBombas;
    }

    public static Casilla[][] getTableroBarcos() {
        return tableroBarcos;
    }
}
