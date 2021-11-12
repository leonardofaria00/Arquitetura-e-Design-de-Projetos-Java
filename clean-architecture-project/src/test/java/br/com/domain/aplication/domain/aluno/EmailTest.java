package br.com.domain.aplication.domain.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {
    @Test
    void naoDeveCriarEmailInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(" "));
        assertThrows(IllegalArgumentException.class, () -> new Email("email"));
    }

    @Test
    void deveCriarEmailValido() {
        final String endereco = "email@gmail.com";
        final Email email = new Email(endereco);

        assertEquals(endereco, email.getEndereco());
    }
}