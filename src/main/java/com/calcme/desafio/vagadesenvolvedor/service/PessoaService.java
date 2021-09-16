package com.calcme.desafio.vagadesenvolvedor.service;

import com.calcme.desafio.vagadesenvolvedor.model.Pessoa;
import com.calcme.desafio.vagadesenvolvedor.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    
    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa savePessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}
