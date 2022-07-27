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

import com.binaryleo.banklineapi.dto.NovoCorrentista;
import com.binaryleo.banklineapi.model.Correntista;
import com.binaryleo.banklineapi.repository.CorrentistaRepository;
import com.binaryleo.banklineapi.service.CorrentistaService;
// Enables Routes for the service
@RestController
@RequestMapping("/correntistas") //endpoint
public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;
    
    @Autowired
    private CorrentistaService service;
    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll(); // return list of all correntistas

    }
    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista){
        service.save(correntista); // save correntista
        }


}
