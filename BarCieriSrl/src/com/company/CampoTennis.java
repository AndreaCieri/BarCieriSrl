package com.company;

public class CampoTennis extends Campo {
    private String tipologiaCampo;

    // Metodo costruttore vuoto
    public CampoTennis () {
    }

    // Metodo costruttore
    public CampoTennis(int idCampo, int maxCapacita, String posizione, boolean disponibilita, String tipologiaCampo){
        super(idCampo, maxCapacita, posizione, disponibilita);
        this.tipologiaCampo = tipologiaCampo;
    }

    // Metodi Get
    public String getTipologiaCampo() {
        return tipologiaCampo;
    }
}
