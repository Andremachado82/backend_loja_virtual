package com.andre.lojavirtual.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serial;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa {

    @Serial
    private static final long serialVersionUID = 1L;

    @CNPJ
    @Column(nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private String razaoSocial;

    private String nomeFantasia;

    private String inscMunicipal;

    private String inscEstadual;

    private String categoria;
}
