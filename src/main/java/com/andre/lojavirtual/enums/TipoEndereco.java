package com.andre.lojavirtual.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum TipoEndereco {

    COBRANCA("Cobrança"),
    ENTREGA("Entrega");

    private final String descricao;

    private TipoEndereco(String descricao) {
        this.descricao = descricao;
    }
}
