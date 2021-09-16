package com.calcme.desafio.vagadesenvolvedor.controller;

import com.calcme.desafio.vagadesenvolvedor.DTO.PessoaDTO;
import com.calcme.desafio.vagadesenvolvedor.model.Pessoa;
import com.calcme.desafio.vagadesenvolvedor.service.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pessoa")
public class PessoaController {
 
    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/save")
    public ResponseEntity<Pessoa> savePessoa(@RequestBody PessoaDTO pessoaDTO) {
        Pessoa pessoa = pessoaService.savePessoa(pessoaDTO.toObject());
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
    }
}
