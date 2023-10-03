package com.company;

public class CampoMiniGolf extends Campo {
    private int numeroMulini;
    private int[] difficolta;

    // Metodo costruttore vuoto
    public CampoMiniGolf(){
    }

    // Metodo costruttore
    public CampoMiniGolf(int idCampo, int maxCapacita, String posizione, boolean disponibilita, int numeroMulini, int[] difficolta){
        super(idCampo, maxCapacita, posizione, disponibilita);
        this.numeroMulini = numeroMulini;
        this.difficolta = difficolta;
    }

    // Metodi Get
    public int getNumeroMulini() {
        return numeroMulini;
    }

    public int[] getDifficolta() {
        return difficolta;
    }
}
