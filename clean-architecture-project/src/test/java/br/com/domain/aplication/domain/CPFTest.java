package br.com.domain.aplication.domain;

import br.com.domain.aplication.domain.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFTest {

    @Test
    void NaoDeveriaCriarCPFInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("12345678911"));
    }

    @Test
    void deveCriarCPFValido() {
        final String numero = "123.456.789-11";
        final CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }
}