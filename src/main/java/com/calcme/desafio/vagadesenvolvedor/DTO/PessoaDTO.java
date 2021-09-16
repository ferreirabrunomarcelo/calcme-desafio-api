package com.calcme.desafio.vagadesenvolvedor.DTO;

import com.calcme.desafio.vagadesenvolvedor.model.Pessoa;

public class PessoaDTO {
   
    private String nome;
    private String email;
    private String telefone;

    public PessoaDTO () {

    }

    public Pessoa toObject() {
        return new Pessoa(this.nome, this.email, this.telefone);
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
