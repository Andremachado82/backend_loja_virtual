package com.andre.lojavirtual.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ETipoEndereco {

    COBRANCA("Cobrança"),
    ENTREGA("Entrega");

    private final String descricao;

    private ETipoEndereco(String descricao) {
        this.descricao = descricao;
    }
}
