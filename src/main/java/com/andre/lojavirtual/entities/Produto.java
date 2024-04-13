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
@Table(name = "produto")
public class Produto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    @Column(columnDefinition = "text", length = 2000)
    private String descricaoProduto;

    private String tipoUnidade;

    private Double peso;

    private Double altura;

    private Double largura;

    private Double profundidade;

    private BigDecimal valorUnitario = BigDecimal.ZERO;

    private int qtdeEstoque = 0;

    private int qtdeAlertaEstoque = 0;

    private String linkYoutube;

    private Boolean situacao = Boolean.TRUE;

    private Boolean isAlertaQtdeEstoque = Boolean.FALSE;

    private int qtdeClique = 0;
}



