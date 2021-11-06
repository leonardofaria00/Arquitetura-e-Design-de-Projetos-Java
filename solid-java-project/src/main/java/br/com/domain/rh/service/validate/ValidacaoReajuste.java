package br.com.domain.rh.service.validate;

import br.com.domain.rh.model.Funcionario;

import java.math.BigDecimal;

/*
 * Single Responsibility Principle:
 * Extendendo à interfaces e fazendo apenas uma validação bem feita.
 * Permitindo que outras validações sejam implementadas com baixa coesão e baixo acoplamento.
 */
public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
