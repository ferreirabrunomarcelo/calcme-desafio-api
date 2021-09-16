package com.calcme.desafio.vagadesenvolvedor.repository;

import com.calcme.desafio.vagadesenvolvedor.model.Pessoa;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PessoaRepository extends MongoRepository<Pessoa, Long>{
    
}
