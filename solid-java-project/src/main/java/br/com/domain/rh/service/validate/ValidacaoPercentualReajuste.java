package br.com.domain.rh.service.validate;

import br.com.domain.rh.exceptions.ValidacaoException;
import br.com.domain.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * Single Responsibility Principle: valida apenas o percentual.
 * Extendendo à interfaces e fazendo apenas uma validação bem feita.
 * Permitindo que outras validações sejam implementadas com baixa coesão e baixo acoplamento.
 */
public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

    @Override
    public void validar(final Funcionario funcionario, final BigDecimal aumento) {
        final BigDecimal salario = funcionario.getDadosPessoais().getSalario();
        final BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);

        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0)
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");

    }
}
