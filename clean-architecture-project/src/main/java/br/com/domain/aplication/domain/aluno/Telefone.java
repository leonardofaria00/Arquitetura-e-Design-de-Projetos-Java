package br.com.domain.aplication.domain.aluno;

import java.util.Objects;

public class Telefone {
    private final String ddd;
    private final String numero;

    public Telefone(final String ddd, final String numero) {
        validateMandatory(ddd, numero);
        this.ddd = ddd;
        this.numero = numero;
    }

    private void validateMandatory(final String ddd, final String numero) {
        if (Objects.isNull(ddd) || Objects.isNull(numero)) {
            throw new IllegalArgumentException("DDD e Numero sao obrigatorios");
        }
        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD invalido");
        }
        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Numero invalido");
        }
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
