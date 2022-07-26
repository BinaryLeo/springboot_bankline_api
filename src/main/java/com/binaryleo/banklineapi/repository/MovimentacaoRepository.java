package com.binaryleo.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binaryleo.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository <Movimentacao,Integer> {
    
}
