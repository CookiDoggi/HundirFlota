package com.example.hundirflota;

public class Metodos {
    private static Casilla [][] tableroBombmas;
    private static Casilla [][] tableroUsuario;

    public static Casilla[][] getTableroBombmas() {
        return tableroBombmas;
    }

    public static Casilla[][] getTableroUsuario() {
        return tableroUsuario;
    }

    public void inicializarTableroBombas(){
        tableroBombmas = new Casilla[10][10];
        for(int i = 0;i < tableroBombmas.length;i++){
            for (int j = 0;j < tableroBombmas[0].length;j++){
                tableroBombmas[i][j] = new Casilla(i, j);
            }
        }
    }

    public void inicializarTableroUsuario(){
        tableroUsuario = new Casilla[10][10];
        for(int i = 0;i < tableroUsuario.length;i++){
            for (int j = 0;j < tableroUsuario[0].length;j++){
                tableroUsuario[i][j] = new Casilla(i, j);
            }
        }
    }

    public void ponerBarcos(){

    }

    enum estadoPartidaEnum{
        ponerBarco, juego;
    }
}