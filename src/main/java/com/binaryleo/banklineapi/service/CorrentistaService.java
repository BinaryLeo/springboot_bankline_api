package com.binaryleo.banklineapi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binaryleo.banklineapi.dto.NovoCorrentista;
import com.binaryleo.banklineapi.model.Conta;
import com.binaryleo.banklineapi.model.Correntista;
import com.binaryleo.banklineapi.repository.CorrentistaRepository;
@Service
public class CorrentistaService {
    @Autowired
    private CorrentistaRepository repository;
    public void save(NovoCorrentista novoCorrentista) {
        Correntista correntista = new Correntista();
        correntista.setCpf(novoCorrentista.getCpf());
        correntista.setNome(novoCorrentista.getNome());
        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());
        correntista.setConta(conta); 
        repository.save(correntista);
    }
}
