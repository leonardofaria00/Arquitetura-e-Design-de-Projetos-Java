package br.com.domain.rh.service.validate;

import br.com.domain.rh.exceptions.ValidacaoException;
import br.com.domain.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * Single Responsibility Principle: valida apenas a periodicidade.
 * Extendendo à interfaces e fazendo apenas uma validação bem feita.
 * Permitindo que outras validações sejam implementadas com baixa coesão e baixo acoplamento.
 */
public class ValidacaoPeriodicidadeEntreReajuste implements ValidacaoReajuste {

    @Override
    public void validar(final Funcionario funcionario, final BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDesdeUltimoReajuste < 6)
            throw new ValidacaoException("Intervalo entre reajustes deve ser maior que 6 meses!");

    }
}
