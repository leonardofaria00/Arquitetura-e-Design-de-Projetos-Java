package br.com.domain.rh.service;

import br.com.domain.rh.exceptions.ValidacaoException;
import br.com.domain.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteSalarialService {

    public BigDecimal reajustarSalario(final Funcionario funcionario, final BigDecimal aumento) {
        final BigDecimal salario = funcionario.getSalario();
        final BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);

        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
        return salario.add(aumento);
    }
}
