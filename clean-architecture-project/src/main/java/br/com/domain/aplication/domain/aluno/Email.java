package br.com.domain.aplication.domain.aluno;

import java.util.Objects;

public class Email {
    private final String endereco;

    public Email(final String endereco) {
        if (Objects.isNull(endereco) || isEmailInvalid(endereco)) {
            throw new IllegalArgumentException("E-mail invalid");
        }
        this.endereco = endereco;
    }

    private boolean isEmailInvalid(String endereco) {
        return !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    public String getEndereco() {
        return endereco;
    }
}
