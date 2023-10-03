package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Start programma con istanza
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GestioneCampi gestioneCampi = new GestioneCampi(); // Crea un'istanza di GestioneCampi
                new CampoTableApp(gestioneCampi);
            }
        });
    }
}

