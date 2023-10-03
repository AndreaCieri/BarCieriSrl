package com.company;

import java.util.ArrayList;
import java.util.List;


public class GestioneCampi {
    public List<Campo> campi = new ArrayList<>();

    public GestioneCampi(){
    // campi calcio
        CampoCalcio campoCalcio1 = new CampoCalcio(1, 10, "Via Argentina, 12, Sasso Marconi BO", true, 3);
        CampoCalcio campoCalcio2 = new CampoCalcio(2, 10, "Via Argentina, 12, Sasso Marconi BO", false, 2);
            campi.add(campoCalcio1);
            campi.add(campoCalcio2);
    // campi da tennis
        CampoTennis campoTennis1 = new CampoTennis(3, 2, "Via Cova, 12, Vado BO", false, "Erba Naturale");
        CampoTennis campoTennis2 = new CampoTennis(4, 2, "Via Cova, 12, Vado BO", true, "Terra Rossa");
        CampoTennis campoTennis3 = new CampoTennis(5, 2, "Via Cova, 12, Vado BO", true, "Terra Rossa");
            campi.add(campoTennis1);
            campi.add(campoTennis2);
            campi.add(campoTennis3);
    // campi da mini golf
        int[] difficoltaGolf = {1, 2, 3, 4, 5};
        CampoMiniGolf campoMiniGolf1 = new CampoMiniGolf(6, 5, "Via America, 2, Sasso Marconi BO", false, 2, difficoltaGolf);
        CampoMiniGolf campoMiniGolf2 = new CampoMiniGolf(7, 2, "Via America, 2, Sasso Marconi BO", true, 0, difficoltaGolf);
        CampoMiniGolf campoMiniGolf3 = new CampoMiniGolf(8, 3, "Via America, 2, Sasso Marconi BO", true, 1, difficoltaGolf);
        CampoMiniGolf campoMiniGolf4 = new CampoMiniGolf(9, 2, "Via America, 2, Sasso Marconi BO", true, 2, difficoltaGolf);
        CampoMiniGolf campoMiniGolf5 = new CampoMiniGolf(10, 5, "Via America, 2, Sasso Marconi BO", false, 0, difficoltaGolf);
        CampoMiniGolf campoMiniGolf6 = new CampoMiniGolf(11, 6, "Via America, 2, Sasso Marconi BO", false, 1, difficoltaGolf);
        CampoMiniGolf campoMiniGolf7 = new CampoMiniGolf(12, 2, "Via America, 2, Sasso Marconi BO", false, 1, difficoltaGolf);
            campi.add(campoMiniGolf1);
            campi.add(campoMiniGolf2);
            campi.add(campoMiniGolf3);
            campi.add(campoMiniGolf4);
            campi.add(campoMiniGolf5);
            campi.add(campoMiniGolf6);
            campi.add(campoMiniGolf7);
    }
}