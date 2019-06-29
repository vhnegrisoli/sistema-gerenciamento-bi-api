package br.com.continuum.sistemabi.sistemagerenciamentobi.modules.usuario.enums;

import lombok.Getter;

public enum ESituacao {

    ATIVO("ATIVO"),
    INATIVO("INATIVO");

    @Getter
    private String situacao;

    ESituacao(String situacao) {
        this.situacao = situacao;
    }

}
