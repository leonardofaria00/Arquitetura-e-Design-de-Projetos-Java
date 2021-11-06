package br.com.domain.rh.service;

import br.com.domain.rh.exceptions.PromocaoException;
import br.com.domain.rh.model.Cargo;
import br.com.domain.rh.model.Funcionario;

public class PromocaoCargoService {
    public void promover(final Funcionario funcionario, final boolean metaBatida) {
        final Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
        if (Cargo.GERENTE.equals(cargoAtual))
            throw new PromocaoException("Gerente nao pode ser promovido.");

        if (!metaBatida)
            throw new PromocaoException("Funcionario nao bateu a meta!");

        final Cargo proximoCargo = cargoAtual.getProximoCargo();
        funcionario.promover(proximoCargo);
    }
}
