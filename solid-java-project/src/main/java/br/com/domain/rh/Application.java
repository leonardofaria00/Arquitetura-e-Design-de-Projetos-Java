package br.com.domain.rh;

import br.com.domain.rh.model.Cargo;
import br.com.domain.rh.model.Funcionario;
import br.com.domain.rh.service.PromocaoCargoService;
import br.com.domain.rh.service.ReajusteSalarialService;
import br.com.domain.rh.service.validate.ValidacaoPercentualReajuste;
import br.com.domain.rh.service.validate.ValidacaoReajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        final Funcionario funcionario = new Funcionario("Leonardo", "02118585101", Cargo.ESPECIALISTA, new BigDecimal(10000), LocalDate.now());

        List<ValidacaoReajuste> validacoes = List.of(new ValidacaoPercentualReajuste());
        final ReajusteSalarialService salarioService = new ReajusteSalarialService(validacoes);
        salarioService.reajustarSalario(funcionario, new BigDecimal(500));

        final PromocaoCargoService promocaoService = new PromocaoCargoService();
        promocaoService.promover(funcionario, true);

        System.out.println(funcionario.getDadosPessoais().getUuid());
        System.out.println(funcionario.getDadosPessoais().getSalario());
        System.out.println(funcionario.getDadosPessoais().getCargo());
        System.out.println(funcionario.getDataUltimoReajuste());
    }
}
