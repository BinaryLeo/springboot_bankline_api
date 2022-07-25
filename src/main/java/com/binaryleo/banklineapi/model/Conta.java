package com.binaryleo.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {
    @Column(name = "conta_numero")
    private Long numero; // account number
    @Column(name = "conta_saldo")
    private Double saldo; // account balance

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
