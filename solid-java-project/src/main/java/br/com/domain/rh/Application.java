package br.com.domain.rh;

import br.com.domain.rh.model.Cargo;
import br.com.domain.rh.model.Funcionario;
import br.com.domain.rh.service.ReajusteSalarialService;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        final Funcionario leonardo = new Funcionario("Leonardo", "02118585101", Cargo.ESPECIALISTA, new BigDecimal(10000));

        final ReajusteSalarialService salarioService = new ReajusteSalarialService();
        final BigDecimal salarioReajustado = salarioService.reajustarSalario(leonardo, new BigDecimal(500));

        leonardo.atualizarSalario(salarioReajustado);

        System.out.println(leonardo.getSalario());

    }
}
