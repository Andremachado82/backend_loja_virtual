package com.andre.lojavirtual.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name = "imagem_produto")
public class ImagemProduto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(columnDefinition = "text")
    private String imagemOriginal;

    @Column(columnDefinition = "text")
    private String imagemMiniatura;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false,
    foreignKey = @ForeignKey(name = "produto_fk", value = ConstraintMode.CONSTRAINT))
    private Produto produto;
}



