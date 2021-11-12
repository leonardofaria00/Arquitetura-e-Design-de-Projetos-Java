package br.com.domain.aplication.domain.aluno;

import java.util.Objects;

public class CPF {
    private String numero;

    public CPF(final String numero) {
        if (Objects.isNull(numero) || isCPFInvalid(numero)) {
            throw new IllegalArgumentException("CPF invalid.");
        }
        this.numero = numero;
    }

    private boolean isCPFInvalid(final String numero) {
        return !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}");
    }

    public String getNumero() {
        return numero;
    }

}
