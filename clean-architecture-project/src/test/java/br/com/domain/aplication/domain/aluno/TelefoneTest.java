package br.com.domain.aplication.domain.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("61", "123456"));
    }

    @Test
    void deveCriarTelefoneComDDDsValidos() {
        final String ddd = "61";
        final String numero = "999999999";
        final Telefone telefone = new Telefone(ddd, numero);

        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }
}