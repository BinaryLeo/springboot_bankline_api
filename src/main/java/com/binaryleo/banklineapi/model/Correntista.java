package com.binaryleo.banklineapi.model;

public class Correntista {
 private Integer id; // account id
 private String cpf; // account Brazilian CPF number
 private String nome; // account name
 private Conta conta; // account number

 public Conta getConta() {
    return conta;
    }
    public void setConta(Conta conta) {
    this.conta = conta;
    }
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
  

}
