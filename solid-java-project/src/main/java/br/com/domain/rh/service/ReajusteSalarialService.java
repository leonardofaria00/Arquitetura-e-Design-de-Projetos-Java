package br.com.domain.rh.service;

import br.com.domain.rh.model.Funcionario;
import br.com.domain.rh.service.validate.ValidacaoReajuste;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteSalarialService {
    /*
     * Single Responsibility Principle: criando uma referência da interface.
     */
    private List<ValidacaoReajuste> validacoes;

    public ReajusteSalarialService(final List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalario(final Funcionario funcionario, final BigDecimal aumento) {
        /*
         * Permitindo que todas as classes que implementam a interface validem as regras.
         * É possível observar o baixo acoplamento, alta coesão e forte encapsulamento.
         */
        validacoes.forEach(v -> v.validar(funcionario, aumento));

        final BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
