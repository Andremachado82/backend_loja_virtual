package com.andre.lojavirtual.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Builder
@Entity
@Table(name = "cupom_desconto")
public class CupomDesconto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String descricao;

    private BigDecimal percentualDesconto;

    private BigDecimal valorDesconto;

    @Temporal(TemporalType.DATE)
    private Date dtValidadeCupom;
}



