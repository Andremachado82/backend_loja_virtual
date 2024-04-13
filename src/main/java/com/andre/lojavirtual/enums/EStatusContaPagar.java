package com.andre.lojavirtual.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum EStatusContaPagar {

    ABERTA("Aberta"),
    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    QUITADA("Quitada"),
    ALUGUEL("Aluguel"),
    FUNCIONARIO("Funcionário"),
    NEGOCIADA("Renegociada");

    private final String descricao;

    private EStatusContaPagar(String descricao) {
        this.descricao = descricao;
    }
}
