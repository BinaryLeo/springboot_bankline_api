package com.binaryleo.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binaryleo.banklineapi.model.Correntista;

public interface CorrentistaRepository  extends JpaRepository<Correntista, Integer>{
    
}
