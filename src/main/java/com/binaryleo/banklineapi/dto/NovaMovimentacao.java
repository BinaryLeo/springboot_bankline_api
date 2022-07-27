package com.binaryleo.banklineapi.dto;

import com.binaryleo.banklineapi.model.MovimentacaoTipo;

public class NovaMovimentacao {
    private String descricao; // transaction description
    private Double valor;// transaction value
    private MovimentacaoTipo tipo;
    private Integer idConta; // Account id

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public MovimentacaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(MovimentacaoTipo tipo) {
        this.tipo = tipo;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }
}
