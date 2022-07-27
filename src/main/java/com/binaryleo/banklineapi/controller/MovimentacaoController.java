package com.binaryleo.banklineapi.controller;
/* Responsible for the web service that
 will be used to manage the banklineapi_db
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binaryleo.banklineapi.dto.NovaMovimentacao;
import com.binaryleo.banklineapi.model.Movimentacao;
import com.binaryleo.banklineapi.repository.MovimentacaoRepository;
import com.binaryleo.banklineapi.service.MovimentacaoService;
// Enables Routes for the service
@RestController
@RequestMapping("/movimentacao") //endpoint
public class MovimentacaoController {
    @Autowired
    private MovimentacaoRepository repository;
    
    @Autowired
    private MovimentacaoService service;
    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll(); // return list of all movimentacao (Transactions)

    }
    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao){
        service.save(movimentacao); // save movimentacao / Transaction
        }


}
