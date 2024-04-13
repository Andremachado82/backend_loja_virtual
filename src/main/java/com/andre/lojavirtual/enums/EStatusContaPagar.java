package com.andre.lojavirtual.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum EStatusContaPagar {

    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    QUITADA("Quitada"),
    NEGOCIADA("Renegociada"),
    ABERTA("Aberta");

    private final String descricao;

    private EStatusContaPagar(String descricao) {
        this.descricao = descricao;
    }
}
