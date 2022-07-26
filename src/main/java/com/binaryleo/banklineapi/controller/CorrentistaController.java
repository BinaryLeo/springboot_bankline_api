package com.binaryleo.banklineapi.controller;
/* Responsible for the web service that
 will be used to manage the banklineapi_db
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binaryleo.banklineapi.model.Correntista;
import com.binaryleo.banklineapi.repository.CorrentistaRepository;

@RestController
@RequestMapping("/correntistas") //endpoint
public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;
    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();

    }

}
