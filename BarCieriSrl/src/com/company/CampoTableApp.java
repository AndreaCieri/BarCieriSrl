package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CampoTableApp extends JFrame {
    private JTable table;
    private JCheckBox checkBox;
    private GestioneCampi gestioneCampi;

    public CampoTableApp(GestioneCampi gestioneCampi) {
        this.gestioneCampi = gestioneCampi;

        setTitle("Gestione Campi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null);

        // Nomi delle colonne
        String[] columnNames = {"ID", "Posizione", "Max Capacità", "Tipo Campo", "Disponibilità"};

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames); // Imposta i nomi delle colonne

        // Popola la tabella con i dati da gestioneCampi
        for (Campo campo : gestioneCampi.campi) {
            model.addRow(new Object[] {campo.getIdCampo(), campo.getPosizione(), campo.getMaxCapacita(), campo.getTipoCampo(), campo.isDisponibile()});
        }

        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);

        checkBox = new JCheckBox("Filtro solo campi disponibili");
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtroDisponibilita();
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(checkBox, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);

        setVisible(true);
    }

    private void filtroDisponibilita() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        if (checkBox.isSelected()) {
            // Cicla all'indietro attraverso le righe del modello per evitare problemi di indice
            for (int row = model.getRowCount() - 1; row >= 0; row--) {
                Campo campo = gestioneCampi.campi.get(row);
                if (!campo.getDisponibilita()) {
                    model.removeRow(row); // Rimuovi la riga se la disponibilità è false
                }
            }
        } else {
            // Se la casella di controllo non è selezionata, ricarica tutti i dati
            model.setRowCount(0);
            for (Campo campo : gestioneCampi.campi) {
                model.addRow(new Object[] {campo.getIdCampo(), campo.getPosizione(), campo.getMaxCapacita(), campo.getTipoCampo(), campo.isDisponibile()});
            }
        }
    }
}


