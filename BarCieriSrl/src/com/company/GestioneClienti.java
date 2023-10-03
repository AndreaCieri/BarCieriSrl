package com.company;

import java.util.ArrayList;
import java.util.List;

public class GestioneClienti {
    public List<Cliente> clienti = new ArrayList<>();

    public boolean aggiungiCliente(Cliente nuovoCliente) {
        for (Cliente cliente : clienti) {
            if (cliente.getEmail().equalsIgnoreCase(nuovoCliente.getEmail()) && cliente.getTelefono().equalsIgnoreCase(nuovoCliente.getTelefono())) {
                System.out.print("Il Cliente già esiste");
                return false;
            }
        }

        clienti.add(nuovoCliente);
        return true;
    }
}


