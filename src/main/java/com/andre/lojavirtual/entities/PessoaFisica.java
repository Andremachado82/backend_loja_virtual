package com.andre.lojavirtual.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa {

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    @CPF
    private String cpf;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dtNascimento;
}
