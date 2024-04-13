package com.andre.lojavirtual.entities;

import com.andre.lojavirtual.enums.EStatusContaReceber;
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
@Table(name = "nota_fiscal_compra")
public class NotaFiscalCompra implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nroNota;

    private String nroSerie;

    private String descricaoNota;

    private BigDecimal valorTotal;

    private BigDecimal valorDesconto;

    private BigDecimal valorIcms;

    @Temporal(TemporalType.DATE)
    private Date dtCompra;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "conta_pagar_id", nullable = false)
    private ContaPagar contaPagar;
}



