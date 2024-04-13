package com.andre.lojavirtual.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum EStatusContaReceber {

    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    QUITADA("Quitada"),
    ABERTA("Aberta");

    private final String descricao;

    private EStatusContaReceber(String descricao) {
        this.descricao = descricao;
    }
}
