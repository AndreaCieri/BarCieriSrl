package com.company;

public abstract class Campo {
    private int idCampo;
    private int maxCapacita;
    private String posizione;
    private boolean disponibilita;

    // Metodo costruttore vuoto
    public Campo () {
    }

    // Metodo costruttore
    public Campo (int idCampo, int maxCapacita, String posizione, boolean disponibilita){
        this.idCampo = idCampo;
        this.maxCapacita = maxCapacita;
        this.posizione = posizione;
        this.disponibilita = disponibilita;
    }

    // Metodi set
    public void setDisponibilita(boolean disponibilita) {
        this.disponibilita = disponibilita;
    }

    // Metodi get
    public boolean getDisponibilita(){
        return disponibilita;
    }

    public int getIdCampo() {
        return idCampo;
    }

    public int getMaxCapacita() {
        return maxCapacita;
    }

    public String getPosizione() {
        return posizione;
    }


    // Metodo toString
    @Override
    public String toString() {
        return "Campo{" +
                "id=" + idCampo +
                ", Capacità Massima=" + maxCapacita +
                ", Dove si trova='" + posizione + '\'' +
                ", disponibilitò=" + disponibilita +
                '}';
    }

    // Metodo ritorno Stringa nome classe
    public String getTipoCampo() {
        return this.getClass().getSimpleName();
    }

    // Metodo ritorno stringa Disponibilità
    public String isDisponibile(){
        if(disponibilita){
            return "Disponibile";
        } else {
            return "Non disponibile";
        }
    }
}
