package com.company;

public class CampoCalcio extends Campo {
    private int palloniDisponibili;

    // Metodo costruttore vuoto
    public CampoCalcio () {
    }

    // Metodo costruttore
    public CampoCalcio (int idCampo, int maxCapacita, String posizione, boolean disponibilita, int palloniDisponibili) {
        super(idCampo, maxCapacita, posizione, disponibilita);
        this.palloniDisponibili = palloniDisponibili;
    }

    // Metodi Get
    public int getPalloniDisponibili() {
        return palloniDisponibili;
    }
}
