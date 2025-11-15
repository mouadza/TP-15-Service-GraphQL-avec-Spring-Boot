// AVANT
// private LocalDateTime date;

package com.example.banqueservice.dto;

import com.example.banqueservice.entities.TypeTransaction;

import java.time.LocalDateTime;

public class TransactionRequest {

    private Long compteId;
    private double montant;
    private String date;           // ✅ String ici
    private TypeTransaction type;

    public Long getCompteId() {
        return compteId;
    }

    public void setCompteId(Long compteId) {
        this.compteId = compteId;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TypeTransaction getType() {
        return type;
    }

    public void setType(TypeTransaction type) {
        this.type = type;
    }
}
