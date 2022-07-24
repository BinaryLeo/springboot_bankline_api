package com.binaryleo.banklineapi.model;
import java.time.LocalDateTime;
public class Movimentacao {
private Integer id; // transaction id
private LocalDateTime dataHora; //transaction date and time
private String descricao; // transaction description
private Double valor;// transaction value
private MovimentacaoTipo tipo;
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public LocalDateTime getDataHora() {
    return dataHora;
}
public void setDataHora(LocalDateTime dataHora) {
    this.dataHora = dataHora;
}
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



}
